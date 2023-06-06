import java.util.Scanner;
import java.util.regex.*;

class metacharactorDemo {
    public static void main(String args[]){

    // Use of '\\d' -> this is for digit(0-9)
    /*     System.out.println(Pattern.matches("\\d", "a"));  // false
        System.out.println(Pattern.matches("\\d", "9"));  //true
        System.out.println(Pattern.matches("\\d", "30")); //false
        System.out.println(Pattern.matches("\\d+", "33"));  //true
         */

    // Use of '\\D' -> without digit(^[0-9])
   /*      System.out.println(Pattern.matches("\\D", "a"));  // true
        System.out.println(Pattern.matches("\\D", "9"));  //false
        System.out.println(Pattern.matches("\\D", "avaca")); //false
        System.out.println(Pattern.matches("\\D+", "acaca"));  //true

     */

    // Use of '\\b' -> word boundary

   /*      Pattern p = Pattern.compile("\\blearn\\b");
        // Matcher m = p.matcher("I want to learn java from learnVern");    // True
        Matcher m = p.matcher("I want to understand java from learnVern"); //false

        System.out.println(m.find());

         */

    // use of '\\w' -> word formation(any word with digit)

/*     System.out.println(Pattern.matches("\\w", "a"));    //true
    System.out.println(Pattern.matches("\\w", "A"));    //true
    System.out.println(Pattern.matches("\\w", "O"));    //true
    System.out.println(Pattern.matches("\\w", "("));    //false
        */ 


    // use of '\\W' -> neglet word (any word with digit)
/*     System.out.println(Pattern.matches("\\W", "a"));    //false
    System.out.println(Pattern.matches("\\W", "A"));    //false
    System.out.println(Pattern.matches("\\W", "O"));    //false
    System.out.println(Pattern.matches("\\W", "("));    //true

     */

    // validate email id

    System.out.println(Pattern.matches("^[a-z][a-z0-9.-_]*[a-z0-9]+@[a-z]+[\\.][a-z]{2,3}$", "-xyz12q@gmail.com"));

    
    }
}
