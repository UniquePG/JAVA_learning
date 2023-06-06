import java.util.Scanner;

class example {
    String a;
    int b;

    public boolean login(String a, int b){

        if(a.equals("aaa") && b == 123){
            return true;
        }
        else
        {
            return  false;
        }
    }

}

class exampl2 extends example{
    int aa;
    int bb;

   

    
}

class demo{
    public static void main(String args[]){
        exampl2 obj = new exampl2();
        
        Scanner sc = new Scanner(System.in);
        String aa = sc.next();
        int bb = sc.nextInt();
        
        if(obj.login(aa, bb)){
            System.out.println("Login");
        }
        else{
            System.out.println("incorrect");
        }
    }
}
