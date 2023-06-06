import java.util.function.Function;

class Function_interfaceDemo {
    public static void main(String args[]){

        Function<Integer, Double> hlf = a -> a/2.0;
        // apply() method
        System.out.println("use of apply method");
        System.out.println(hlf.apply(10));
        
        // Use of andthen()
        System.out.println("Use of andthen method");
        hlf = hlf.andThen(a -> a * 3);  // first calculate 'hlf'(calculate the apply method of the hlf) and then (a->a*3)
        System.out.println(hlf.apply(10));

        // Use of compose()
        System.out.println("Use of compose method");
        hlf = hlf.compose(a -> a * 3);  // first calculate (a-> a*3) and then 'hlf' [i ]
        System.out.println(hlf.apply(10));
        
        



    }
}
