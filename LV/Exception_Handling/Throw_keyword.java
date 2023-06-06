class ThrowDemo{
    public static void main(String args[]){
        int a, b;

        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            // if(b == 0)
            if(a <= 0 || b <= 0)
            {
                throw new ArithmeticException();    // if exception occures then execution go to catch block
            }
            int ans = a/b;
            System.out.println("The ans is: "+ ans);
        }catch(ArithmeticException e){
            // System.out.println("Sorry you cant divide by Zero");
            System.out.println("Sorry we want both numbers to be non-Zero positive integers");
        }
    }
}