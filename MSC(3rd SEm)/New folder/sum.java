import java.util.Scanner;

class Sum{
    int a, b;
    public void set(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void dosum(){
        int sum = a + b;
        System.out.println("The Sum of " + a + " and "+ b +" is " + sum);
    }

    public static void main(String args[]){
        Sum s = new Sum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter two numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();

        s.set(a, b);
        s.dosum();
    }
}