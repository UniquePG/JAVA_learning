import java.util.function.Predicate;

class predicate_Demo2 {
    public static void main(String args[]){

        Predicate <Integer> gt = i -> i>10;

        Predicate <Integer> lt = i -> i<20;

        // Use of and() -> Logical and 
        System.out.println("Use of And function");
        // 1
        boolean result = gt.and(lt).test(15);   
        System.out.println(result);

        // 2
        result = gt.and(lt).test(25);
        System.out.println(result);

        // 3
        result = gt.and(lt).test(5);
        System.out.println(result);

        // Use of negate()
        System.out.println("Use of negate function");

        result = gt.negate().test(15);      // negate the result
        System.out.println(result);

        result = gt.negate().test(25);
        System.out.println(result);

        result = gt.negate().test(5);
        System.out.println(result);

        // Use of OR()

        System.out.println("Use of or function");

        result = gt.or(lt).test(15);      // negate the result
        System.out.println(result);

        result = gt.or(lt).test(25);
        System.out.println(result);

        result = gt.or(lt).test(5);
        System.out.println(result);

        

    }    
}
