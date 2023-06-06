import java.io.*;
class Reader_Writter_Demo {
    public static void main(String args[]){
        Reader fin;
        Writer fout;
        int c;
        if(args.length != 2)
            System.out.println("Please input Two Files in Command link Arguement");

        try {
            // Take two files - 1st as Source file & 2nd as Destination file
            fin = new FileReader(args[0]);  // make object of FileReader
            fout = new FileWriter(args[1]);  // make object of FileWriter

            do{
                c = fin.read();     // Read from file 'fin' in c
                if(c != -1)
                    fout.write(c);  //write in file 'fout' from c

            }while(c != -1);    // read character by character untill c != -1(means end of file)

        System.out.println("File copied Successfully");

        fin.close();
        fout.close();

        } catch (IOException e) {
            System.out.println("Exception occured....please check files");
        }
    }    
}
