import java.io.*;

class File_demo {
    public static void main(String[] args){

        File myfile = new File("D:\\CODING\\C\\code.c");

        System.out.println("File name: "+ myfile.getName());
        System.out.println("Path of file: "+ myfile.getPath());
        System.out.println("parent of file: "+ myfile.getParent());
        System.out.println("Length of file: "+ myfile.length());
        System.out.println("Is executable file: "+ myfile.canExecute());
        System.out.println("last modification in file: "+ myfile.lastModified());   // in milisecond

        File f = new File("D:\\CODING\\newfolder\\javafilecreate");
        File f1 = new File("D:\\CODING\\newfolder\\filecreatenew");

        if(f.mkdirs())   
            System.out.println("Your File is created");
        else
            System.out.println("Sorry.... please check path");

        System.out.println("Can we read file: "+ myfile.canRead());
        System.out.println("Can we write in file: "+ myfile.canWrite());
        System.out.println("Is file hidden: "+ myfile.isHidden());
        
    }    


}
