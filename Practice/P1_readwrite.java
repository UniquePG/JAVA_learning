import java.io.*;
import java.text.FieldPosition;

class P1_readwrite {
    public static void main(String args[]){

        try{
            // Read file 
            File f = new File(args[0]);
            FileInputStream fis = new FileInputStream(f);
            byte b[] = new byte[(int) f.length()];
           int ab =  fis.read(b);

            // Write file
            File f1 = new File(args[1]);

            FileOutputStream fos = new FileOutputStream(f1);
            fos.write(b);

        }catch(IOException ioe){
            System.out.println("Exception found");
        }
    }
}
