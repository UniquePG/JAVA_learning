class Queue{
    int item;
    boolean busy = false;
    synchronized int get(){
        if(!busy){
            try{
                wait();         // consumer hava to wait (meanwhile producer executers put method)

            }catch(InterruptedException ie){}
        }
        System.out.println("Get: "+ item);
        busy = false;
        notify();   // this notify the waiting thread (producer[put])
        return item;
    }

    synchronized void put(int item){

        if(busy){
            try{
                wait();     // producer have to wait (meanwhile consumer executed get method)

            }catch(InterruptedException iw){}
        }
        this.item = item;
        busy = true;
        System.out.println("Put: " + item);
        notify();   // This notify waiting thread (consumer[get])
    }
}

class producer extends Thread {
    Queue q;

    public producer (Queue q){
        this.q = q;
    }

    public void run(){
        int i=1;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;

    public Consumer(Queue q){
        this.q = q;
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}
class InterThread_communication {
    public static void main(String args[]){
        Queue q = new Queue();
        producer p = new producer(q);
        Consumer c = new Consumer(q);
        System.out.println("press ctrl+c to stop");
        p.start();
        c.start();
    }
}
