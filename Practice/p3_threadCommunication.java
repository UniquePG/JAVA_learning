class displaymess{

    boolean busy = false;
    synchronized void printT1(){
        if(!busy){
            try{
                wait();
                
            }catch(InterruptedException ie){}
            
        }
        System.out.print(" PING ");
        busy = false;
        notify();
    }

    synchronized void printT2(){

        if(busy){
            try{
                wait();

            }catch(InterruptedException iw){}
        }
        busy = true;
        System.out.println(" PONG ");
        notify();
    }
}

class T1 extends Thread{
    displaymess d1;

    public T1(displaymess d1){
        this.d1 = d1;
    }

    public void run(){
        while(true){
        try{
            d1.printT1();
            sleep(200);
        }
        catch(InterruptedException iw){}
        }
    }
}

class T2 extends Thread{
    displaymess d2;

    public T2(displaymess d2){
        this.d2 = d2;
    }

    public void run(){

         while(true){
            try{
            d2.printT2();
            sleep(200);
            }
        catch(InterruptedException iw){}
        }
    }
}

class P3Intercommunication{
    public static void main(String args[]){

        displaymess d = new displaymess();

        T1 th1 = new T1(d);
        T2 th2 = new T2(d);

        th1.start();
        th2.start();
    }
}