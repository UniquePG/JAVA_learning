import java.io.*;

class Input_output_streamDemo {
    public static void main(String [] args){
// Input / output Stream work on binary 
    try{
        File f = new File("D:\\CODING\\JAVA\\Demo\\demo.jpg"); // Create file object

        // Create Input Stream
        FileInputStream obj_input = new FileInputStream(f);     
        byte b[] = new byte[(int)f.length()];   // array 'b[]' ka size -> f.length() (gives size in long type so we typecast it into int) 
        int numbyte = obj_input.read(b);    // Read binary data from file

        System.out.println("Data from file read successfully.");


        // Create Output Stream
        FileOutputStream obj_output = new FileOutputStream("D:\\CODING\\JAVA\\Test\\Test1.jpg");
        obj_output.write(b);    // Write binary data in File
        System.out.println("Data written to File successfully.");

        }catch(IOException e){
            System.out.println("Exception Occured");
        }
    }
}
