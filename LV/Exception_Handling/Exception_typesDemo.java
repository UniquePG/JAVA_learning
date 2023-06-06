import java.io.*;

// Two types of exception:
/* 
  1) Checked Exception-> Compiler give error/ This is need to handle
  2) Unchecked Exception-> Compiler not give error / Not need to handle (Run time exceptions)
 */
class Exception_typesDemo {
    // "throws Exception " written in the main methord if there is checked exception and we dont handle it
    public static void main(String args[]) throws Exception 
    {

        // This will throw Unchecked exception(this is not checked by the compiler[Not compulsion to handle that exception ])
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a == 0 || b == 0){
            // throw new ArithmeticException();    // Unchecked exception(not need to handle)
            throw new Exception();                 // Checked exception (need to be handled)[compile error]
        }

        int ans = a/b;

        System.out.println("Ans is: "+ ans);


        // This will throw Checked exception(this is checked by the compiler[Here we have compulsion to handle these exception])


 /*       try{
        FileInputStream f = null;
        f = new FileInputStream("D:\\CODING\\JAVA\\LV\\Exception_Handling\\Dummy.txt");
        int m;
        while((m = f.read()) != -1){
            System.out.println((char) m);
        }
        f.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println("Please check.....File not found");
        }
        catch(IOException ioe){
            System.out.println("Could not perform exception");
        } */
      
        /* 
         We have to handle all types of exception that may occure (in Checked exception)
         */
    }    
}
