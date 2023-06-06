import javax.xml.transform.SourceLocator;

class multiple_catch_demo {
    public static void main(String [] args){
        try{
            int a;
            int b;
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            if(a == 0 || b == 0)
                throw new ArithmeticException();    // throw an exception 
            if(a < 0 || b < 0)
                throw new Exception();      // throe an exception

            System.out.println("Thanku you fro using this class");
        }
        catch(ArithmeticException ae){  // handle exception 1
            System.out.println("Either of the value entered are zero");
            // System.exit(1);     // exit -> exit from whole try catch finally block
            // return;             // return -> this will return after execute finally block
        }
        catch(ArrayIndexOutOfBoundsException aibe){     // handle exception 2
            System.out.println("Please provide 2 command line arguements");
        }
        catch(NumberFormatException nfe){       // handle exception 3
            System.out.println("Please provide integer values only");
        }
        catch(Exception se){    // handle exception 4      this is the base of all exception class(written in last if we have multiple catch )
            System.out.println("Either of the value entered are less then zero");
        }
        finally{    // this is always executed
            System.out.println("Thanku for using My program......");
        }
      /*   finally{    // this is always executed
            System.out.println("Thanku for using My program......");
        } */

        System.out.println("After finally block");
    }    
}


/*
    - we write multiple catch block with a Try block 
   - we can not write finally block before the catch block
   - we can write finally block without catch block
   - We can NOT write multiple finally block 
 */
