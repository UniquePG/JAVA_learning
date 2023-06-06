import java.util.Random;
import java.util.function.*;
import java.util.random.*;

class supplier_interface {
    public static void main(String args[]){

        // supplier interface
        Supplier s_obj = () -> new Random().nextInt(50);    // fetch random numbers in the range 50


        // supplier interface -> get() method
        System.out.println(s_obj.get());    
        System.out.println(s_obj.get());
        System.out.println(s_obj.get());
        System.out.println(s_obj.get());
        System.out.println(s_obj.get());
        System.out.println(s_obj.get());
        System.out.println(s_obj.get());
    }
}
