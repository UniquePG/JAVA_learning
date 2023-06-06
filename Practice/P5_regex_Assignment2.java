import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class regex_Assignment2 {
    public static void main(String args[]){
        System.out.println("Please Enter Your 10-Digit PAN Number");
        Scanner sc = new Scanner(System.in);
        String pan = sc.nextLine();

        // Validate a PAN number
        Pattern p = Pattern.compile("^[A-Z]{3}[T[H[P[C]]]]{1}[A-Z]{1}[0-9]{4}[A-Z]{1}");
        Matcher m = p.matcher(pan);

        if(m.matches())
            System.out.println("Valid PAN Number");
        else
            System.out.println("Invalid PAN Number");
    }
}

/* 
 PAN formate->
    Total 10 digits in PAN number:
    First 3 digits->Alphabate(Upper Case)
    4th digit-> T, H, P, C
    5th digit-> Name First Latter(Upper Case)
    4 digits -> Numeric digits
    10th digit -> Alphabate(Upper Case)
    
 */
