// Make custom Thread Using Thread class(So we extends Thread)

class CustomThread extends Thread { 

    CustomThread(String name){
        super(name);
    }
    
    // run() methord
    public void run(){  // It is compulsory to make run method when we make thread
        for(int i=1; i<=10; i++){
            System.out.println(getName() +": "+ i);     // getName() method to get name of thread
        }

        try{
        Thread.sleep(300);   // it throws exception so we need to write it in try catch
        }  
        catch(InterruptedException ie){
            System.out.println("Custom Theread Interrupted");
        }
    }

    public static void main(String args[]){
        CustomThread ct1 = new CustomThread("Thread one");
        CustomThread ct2 = new CustomThread("Thread two");
        CustomThread ct3 = new CustomThread("Thread three");

        ct1.start();    // Start() Methord are use for executing thread(run() Methord)
        ct2.start();    // Without start() methord Thread not execute
        ct3.start();

        for(int i=1; i<=10; i++){
            System.out.println("Main Thread: "+ i);
        }
        try{
        Thread.sleep(300);   // it throws exception so we need to handle(Use try catch or throws in methrod)
        } 
        catch(InterruptedException ie){
            System.out.println("Main Thread interrupted");
        }
    }
}
