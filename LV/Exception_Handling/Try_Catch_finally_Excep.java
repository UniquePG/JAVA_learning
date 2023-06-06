class Demo {
    public static void main(String [] args){
        int a = 10, b;

        try {
            // converted String into int
            b = Integer.parseInt(args[0]);  // input from user using command line arguement

            int ans = a/b;
            System.out.println("The value of ans is: "+ ans);

        } catch (Exception e) {     // e is object of the exception
            System.out.println("Exception is generated: " + e); // we print 'e' to know the exception
        }
        finally{
            System.out.println("Finally Block-> This will always executed");
        }

        System.out.println("After try block");
    }
}

/* 
 we can not write try block alone without catch or finally block
 catch -> catch block is executed when the exception is generate
 finally -> finally block is always executed (exception generated or not) 
 */