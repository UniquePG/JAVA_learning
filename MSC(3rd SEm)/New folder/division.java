import java.util.Scanner;

class Division {
    int a, b;
    public void set(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void dodivision(){
        int division = a / b;
        System.out.println("The Division of " + a + " and "+ b +" is " + division);
    }

    public static void main(String args[]){
        Division s = new Division();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter two numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();

        s.set(a, b);
        s.dodivision();
    }
}
