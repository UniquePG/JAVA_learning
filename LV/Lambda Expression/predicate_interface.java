import java.util.function.*;

class predicate_interface {
    public static void main(String args[]){
        // predicate interface
        Predicate <Integer> pr = (i) -> (i<18); // (i<18) is the logic of test method
        System.out.println(pr.test(10));    // test() method returns true or false
        System.out.println(pr.test(24));

    
    }    
}
