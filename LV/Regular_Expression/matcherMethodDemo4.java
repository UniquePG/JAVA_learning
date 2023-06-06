import java.util.regex.*;

class matcherMethodDemo4 {
    public static void main(String args[]){
        // Start() & end() method with group (in arguement)

        System.out.println("Start() & end() method with group in arguement.... ");

        Pattern p = Pattern.compile("(Learn)(Vern)");
        Matcher m = p.matcher("Learn From the Best Experts at the LearnVern and enjoy learning");

        while(m.find()){
            // Group 0 -> "Learn""Vern" ( whole group)
            System.out.println("Start() of Group0: " + m.start());  
            System.out.println("End() of Group0: " + m.end());  
            // Group 1 -> "Learn"
            System.out.println("Start() of Group1: " + m.start(1));  
            System.out.println("End() of Group1: "+ m.end(1));

            // Group 2 -> "Vern"
            System.out.println("Start() of Group2: " + m.start(2));
            System.out.println("End() of Group2: "+ m.end(1));
            
        }

    }    
}
