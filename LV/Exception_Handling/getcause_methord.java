class getcause_methord {
    public static void m1() throws Exception{
        int arr[] = { 1, 3, 4, 6, 7};

        try{
            arr[10] = 29;       // exception 1
            
            int ans = arr[1]/0;       // exception 2

        }catch(ArrayIndexOutOfBoundsException ae){

            Exception e = new Exception();  // make a new exception for throw to the next calling location
            e.initCause(ae);        // set the cause of the exception
            throw(e);   // throw exception e 
        }

        // new catch block for anther exception
        catch(ArithmeticException ae){ 

            Exception e = new Exception();  // make a new exception for throw to the next calling location
            e.initCause(ae);        // set the cause of the exception
            throw(e);   // throw exception e 
        }
    }
    public static void main(String args[]){
        try{
            m1();

        }catch(Exception e){
            System.out.println("Cause: "+ e.getCause());    // to know the cause of the exception 
        }
    }
}


/*
  we throw the exeption for-> jisse jo m1 ko call kre use pta chle ke exception hua the aur arrayindexoutofboundexception hua tha isliye new exception create krke usme cause set krke throw kr rhe hai
  */