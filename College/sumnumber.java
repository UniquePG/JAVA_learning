import java.util.Scanner;

class sumnumber {
    public static void main(String[] args) {
    // IF Else example
         System.out.println("Enter your age: ");
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
         if(age>18){
         System.out.println("You are adult");
         }else{
         System.out.println("you are NOT adult");
         }

    // Switch case Example 
        System.out.println("Enter Number 1, 2 or 3: ");
        Scanner mr = new Scanner(System.in);
        int num = mr.nextInt();

        switch (num) {
            case 1:
                System.out.println("Hiii! This is Profesor");

                break;
            case 2:
                System.out.println("Hiii! This is Berlin");

                break;
            case 3:
                System.out.println("Hiii! This is Tokyo");

                break;

            default:
                System.out.println("Sorry you are fail");
                break;
        }

    }
}