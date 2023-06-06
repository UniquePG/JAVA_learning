import java.util.regex.*;
import java.net.SocketTimeoutException;
import java.util.Scanner;

// Quantifiers in regex
public class patternDemo2 {
    public static void main(String args[]){
    // Use of '?'

        // [0-9]? -> pattern,   "6" -> input string 

        // boolean ismatched = Pattern.matches("[0-9]?", "6");  // one occurance of 0 to 9
        // System.out.println(ismatched);

        // ismatched = Pattern.matches("[0-9]?", "68");
        // System.out.println(ismatched);


        // ismatched = Pattern.matches("[0-9]?", "");
        // System.out.println(ismatched);

    // Use of '+'
        // boolean ismatched = Pattern.matches("[0-9]+", "6");  // one or more occurance of 0 to 9
        // System.out.println(ismatched);

        // ismatched = Pattern.matches("[0-9]+", "68");
        // System.out.println(ismatched);


        // ismatched = Pattern.matches("[0-9]+", "87y");
        // System.out.println(ismatched);

        // ismatched = Pattern.matches("[0-9]+", "");
        // System.out.println(ismatched);

    // Use of '*'
        // boolean ismatched = Pattern.matches("[0-9]*", "6");  // zero or more occurance of 0 to 9
        // System.out.println(ismatched);

        // ismatched = Pattern.matches("[0-9]*", "68");
        // System.out.println(ismatched);


        // ismatched = Pattern.matches("[0-9]*", "87y");
        // System.out.println(ismatched);

        // ismatched = Pattern.matches("[0-9]*", "");
        // System.out.println(ismatched);


        String mobno;
        System.out.println("please enter your mobile number");
        Scanner sc = new Scanner(System.in);

        mobno = sc.nextLine();

        System.out.println(isvalidmobno(mobno));

    }

    public static boolean isvalidmobno(String mb){

       return Pattern.matches("[6-9][0-9]{9}", mb);

    }
}
