class AlivemethodDemo extends Thread {
    AlivemethodDemo(){
        start();
    }

    public void run(){
        try{
        System.out.println(getName() + "says....Hello");
        Thread.sleep(500);
        System.out.println(getName() + "Says... Bye");
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String args[]){
        AlivemethodDemo th0 = new AlivemethodDemo();    // Make objects of the thread
        AlivemethodDemo th1 = new AlivemethodDemo();
        AlivemethodDemo th2 = new AlivemethodDemo();

        // Check status of the threads when theads is sleep for 500 milisec
        System.out.println(th0.getName()+ "Is alive: "+ th0.isAlive()); 
        System.out.println(th1.getName()+ "Is alive: "+ th1.isAlive());
        System.out.println(th2.getName()+ "Is alive: "+ th2.isAlive());// isAlive() returns boolean true or false
        System.out.println("State: "+ th1.getState());  // Status of the Thread

        System.out.println("Main sleeping fir 2000 mili seconds");

        try{
            Thread.sleep(2000);  // main sleep for 2000 milisec
        }
        catch(InterruptedException ie){
        }

        // Check Thread status after main sleep for (2000milisec)
        System.out.println(th0.getName()+ "Is alive: "+ th0.isAlive());
        System.out.println(th1.getName()+ "Is alive: "+ th1.isAlive());
        System.out.println("State: "+ th1.getState());  // Status of the Thread

        System.out.println(th2.getName()+ "Is alive: "+ th2.isAlive());

        System.out.println("State: "+ th1.getState());  // Status of the Thread

    }
}
