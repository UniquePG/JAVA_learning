import java.io.RandomAccessFile;
import java.io.IOException;
class RandomAccessFileDemo {
    public static void main(String args[]){

        try{
            String filepath = args[0];  // Take file path in String as Commandline arguement

            // Create Random Access File
            RandomAccessFile raf = new RandomAccessFile(filepath, "rw");    // "RandomAccessFile(pathof file, mode of operation)"  ["rw" -> read-Write , "r" -> read, "w" -> write ]
            byte data[] = new byte[(int) raf.length()];
            raf.read(data);

            System.out.println("The original content of file: \n"+ new String(data)); // data in the byte formate so we change it into String

        /*   
            raf.seek(0);    // move the file pointer to 0th position
            raf.write("This is the content written by the program".getBytes()); //getBytes() method se hame uss string (data) ka binary(byte) mil jayega(as this is a binary stream so we cant write String directly)
            raf.seek(0);    // After written new contenct -> again move file pointer to 0th position

            data = new byte[(int) raf.length()];    // for store new byte array
            raf.read(data);     // read "data"
            System.out.println("Modifies content of the file: \n"); 

            System.out.println(new String(data));   // only "data" print the hashcode, So we change it into String (sothat we can read in our output)
         */ 

            // Now we use append(file ke last me add krana)

            raf.seek(raf.length());    // move the file pointer to the end of the file

            raf.write("This is the content that i want to append in the file".getBytes()); //getBytes() method se hame uss string (data) ka binary(byte) mil jayega(as this is a binary stream so we cant write String directly)

            raf.seek(0);    // After written new contenct -> again move file pointer to 0th position

            data = new byte[(int) raf.length()];    // for store new byte array
            raf.read(data);     // read "data"
            System.out.println("Modifies content of the file: \n"); 

            System.out.println(new String(data));   // only "data" print the hashcode, So we change it into String (sothat we can read in our output)



        }catch(IOException ioe){
            ioe.getStackTrace();
        }
    }
}
