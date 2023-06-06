import java.util.regex.Matcher;
import java.util.regex.Pattern;

class matchesMethodDemo3 {
    public static void main(String args[]){
        // Start(), end() method
        Pattern objp = Pattern.compile("L[a-zA-Z]*n");
        Matcher objm = objp.matcher("Learn From the Best Experts at the Learnvern and enjoy learning");

        int count = 0;

        while(objm.find()){
            count++;
            System.out.println("Count: "+ count);
            System.out.println("Start: "+ objm.start());
            System.out.println("End: "+objm.end());
        }

        

    }    
}
