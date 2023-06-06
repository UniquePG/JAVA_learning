import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mather_ReplacementDemo {
    public static void main(String args[]){
        String s1 = "Welcome to     my program       this is     the demonstration      of replacement method";

        Pattern p1 = Pattern.compile("\\s{2,}");    // 2 or more than 2 white spaces
        Matcher m1 = p1.matcher(s1);

        String rep_string = m1.replaceAll(" ");    // s1 String replace with one whitespace

        String rep_stringF = m1.replaceFirst(" ");  // only First matching replace

        System.out.println("Original string: "+ s1);
        System.out.println("String after replacement: "+ rep_string);
        System.out.println("\n");
        System.out.println("String after First matching replacement: "+ rep_stringF);

        // quotReplcement
        String s2 = "I have 1Dollar";
        Pattern p2 = Pattern.compile("1Dollar");
        Matcher m2 = p2.matcher(s2);

        // To ignore the specific meaning of the sign we use quotereplacement()
        String rep_string3 = m2.replaceAll(m2.quoteReplacement("1$"));

        // String rep_string3 = m2.replaceAll("1$");   // it throws exception (as '$' sign has specific meaning in regex)

        System.out.println("\n original string: "+ s2);
        System.out.println(" string after quotereplacement: "+ rep_string3);
    
    }
}
