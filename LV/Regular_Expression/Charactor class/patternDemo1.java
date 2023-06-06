import java.util.regex.*;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class patternDemo1 {
    public static void main(String args[]){
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        s1 = sc.nextLine();

        // Pattern p1 = Pattern.compile("[^a-e]");
        // Pattern p1 = Pattern.compile("[0-9]");
        Pattern p1 = Pattern.compile("[a-z&&[^l-q]]");
        Matcher m1 = p1.matcher(s1);

        System.out.println(" Is the string is in the range a to e: " + m1.matches());
    }
}
