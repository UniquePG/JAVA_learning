import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class regex_Assignment1 {
    public static void main(String args[]){
        System.out.println("Please Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // Validate name (that starts with Capital Letters)
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]+");
        Matcher m = p.matcher(name);

        if(m.matches())
            System.out.println("Valid Name");
        else    
            System.out.println("Invalid Name");
    }
}
