
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class matchesMethodDemo2 {
    public static void main(String args[]){
        Pattern objP = Pattern.compile("LV");
        Matcher objM = objP.matcher("we know LV stands for learn Vern");

        // Use of the lookingat method
        System.out.println("USe of lookingat method...");
        if(objM.lookingAt())    // search at beginning
            System.out.println("LV found at beginning");
        else
            System.out.println("LV not found at beginning");

        // Use of find method
        System.out.println("Use of the find() Method.....");
        if(objM.find())
            System.out.println("LV is there in the string");
        else    
            System.out.println("LV in not there in the string");
        
        // Use of find method with int in the parameter
        System.out.println("Use of find method with index(int) parameter......  ");
        if(objM.find(15))   
            System.out.println("LV is present in the string after index 15");
        else
            System.out.println("LV is not present in the string after index 15");

        // Use of matches() Method
        System.out.println("Use of the matches() method.......");
        if(objM.matches())
            System.out.println("String follows the pattern LV");
        else
            System.out.println("String does not follows the pattern LV");
     }    
}
