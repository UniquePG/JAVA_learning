// set priority and get priority

class PriorityMethord extends Thread {

    public void run(){
        // currentThread()-> return current thread object
        System.out.println("Priority of the thread: "+ Thread.currentThread() + "is: " + getPriority());   
    }

    public static void main(String [] main){
        PriorityMethord obj1 = new PriorityMethord();
        PriorityMethord obj2 = new PriorityMethord();
        PriorityMethord obj3 = new PriorityMethord();
        // priority is 1 to 10
        obj2.setPriority(Thread.MIN_PRIORITY); // Min priority is 1
        obj3.setPriority(Thread.NORM_PRIORITY); // Normal priority is 5
        // obj1.setPriority(Thread.MAX_PRIORITY); // Max priority is 10
        obj1.setPriority(4); // priority is 2
        obj1.start();  
        obj2.start();
        obj3.start();
    }
}
