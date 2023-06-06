

class DaemonThread_Demo extends Thread {
    
    public void run(){
        try{
            System.out.println("In run Methord: "+ Thread.currentThread());
            while(true){    // Infinite loop (because while is always true)
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException ie){}
                
                System.out.println("In run methord.....woke up again");
            }
        }
        finally{
            System.out.println("Leaving run method");
        }
    }
    public static void main(String [] args){
        System.out.println("Starting Main Thread");
        DaemonThread_Demo obj = new DaemonThread_Demo();
        obj.setDaemon(true);        // Make thread as Daemon thread
        obj.start();

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie){

        }
        System.out.println("Time Up.... Exiting Now");
        
        // When the main method finishes the daemon thread automatically terminated
    }
}
