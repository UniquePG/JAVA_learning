public class recursion {
    public static void main(String[] args) {
        System.out.println("The Factorial is: "+ factorial(5));
    }    

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else
            return n * factorial(n-1);
    }
}
