
class Paraenthesis{

   synchronized void display(String s){     // When more than two threads try to access same methord at the same time then we have to made that method "Syschronized"
        System.out.println("\n");
        System.out.print("(" + s);
        try{
            Thread.sleep(500);
        }catch(InterruptedException ie){}
        System.out.print(")");
    }
}

class Syncronization_Demo extends Thread{

    String s;
    Paraenthesis p;

    public Syncronization_Demo(Paraenthesis p, String s){
        this.p = p;
        this.s = s;
        start();
    }

    public void run(){
        p.display(s);
    }

    public static void main(String args[]){
        Paraenthesis p = new Paraenthesis();
        
        // Multiple thread try to acces same method
        Syncronization_Demo th1 = new Syncronization_Demo(p, "JAVA");        Syncronization_Demo th2 = new Syncronization_Demo(p, "OOPS");
    }
}

/* 
 
// when we made a method synchronized then
 if more than two method accces that method then if one thread execute that method than another Thread have to wait untill previous thread complete the execution

*/