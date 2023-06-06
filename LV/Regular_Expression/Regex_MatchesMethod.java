import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex_MatchesMethod {
    public static void main(String args[]){
        // L[a-zA-Z]*n -> startint 'L' and end 'n' and Inbetween 'small a-z or capital A-Z any occurance'
        Pattern obj_pattern = Pattern.compile("L[a-zA-Z]*n");
        Matcher obj_matcher = obj_pattern.matcher("LearnVern");
        boolean isMatched = obj_matcher.matches();

        if(isMatched)
            System.out.println("String matches the pattern");
        else    
            System.out.println("String does not match the pattern");
    }    
}
