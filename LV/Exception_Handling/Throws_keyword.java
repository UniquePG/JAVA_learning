import java.io.IOException;

class Throws_keyword {
    
    void m1 (int a) throws IOException{
        if(a < 0){
            throw new IOException();
        }
        System.out.println("Valid value a: "+ a);
    }

                //it also declair exception now where m2 is called where we handle the exception
    void m2(int a) throws IOException   
    {
        m1(a);
    }

    public static void main(String [] args){
        Throws_keyword obj = new Throws_keyword();

        int val = Integer.parseInt(args[0]);
        // 1st methord to handle exception
        /* 
        try{
        obj.m1(val);
        }catch(Exception e){}
         */

        try{
        obj.m2(val);
        }catch(Exception e){}
    }
}

/* 
  if we dont want to handle the exception then we declair exception (IOexception) on the main methord also 
 
 */
