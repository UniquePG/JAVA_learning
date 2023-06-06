// Make custom thread using Runnable Interface

class CustomThread2 implements Runnable {
    Thread t;
    CustomThread2(String name){
        t = new Thread(this, name); // Thread t refer the current object of the thread  
        t.start();

        try{
            Thread.sleep(300);
        }
        catch(InterruptedException ie){}
    }

    public void run(){      // Main logic of the Thread (execute by start )
        for(int i=1; i<= 10; i++){
            System.out.println(t.getName()+ " "+ i);
        }
    }

    public static void main(String args[]){
        CustomThread2 cts1 = new CustomThread2("Thread one");
        CustomThread2 cts2 = new CustomThread2("Thread two");
        CustomThread2 cts3 = new CustomThread2("Thread Three");

        for(int i=1; i<=10; i++){
            System.out.println("Main Thread: "+ i);
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException ie){}
        }

    }
}
