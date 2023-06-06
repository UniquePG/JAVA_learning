
// Join Method of the Thread Class
class JoinMethods extends Thread {
    int st;
    JoinMethods(int st){
        start();
        this.st = st;
    }

    public void run(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println(getName() + " : "+ i);
                sleep(st);
            }
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public static void main(String [] args){
        JoinMethods th1 = new JoinMethods(200);// sare threads ka different sleep time
        JoinMethods th2 = new JoinMethods(400);
        JoinMethods th3 = new JoinMethods(600);

        try{
            th1.join();     // jab tak 'th1' apna exicution kahtam nh krta main ke wait krna hai    (jab tk 'th1' exicution khtam krke main ko join nh krta)

            // th2.join(1000);   // timed join 
            th2.join();   
            th3.join(); 
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("Main is Exiting");
        return;
    }    
}
