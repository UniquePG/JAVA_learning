import java.io.File;
import java.util.Date;

class File_Listing_Demo {
    public static void main(String []args){
        String dirname = args[0];   // we take path from the arguement

        File dirfile = new File(dirname);   // dirname must be directory(not a file path)

        if(!dirfile.isDirectory()){
            System.out.println(dirfile+" is not a directory");
            return;     // if path is not directory then return
        }

        // Use of list() Methord 
    /*     for(String f: dirfile.list())  // list() Methord must returns array_of_string(filenames) so we use loop for printing list of filesNames
        {
            System.out.println(f);      // print all files in that directory(D:\\coding)
        }
     */

     // listFile() Methord (it returs array of file)

        File [] arrfile = dirfile.listFiles();     // make array_of_File (arrfile) of dirfile(directory)
        
        Date filedate = new Date();     // for showing files with date and time so we intensiate Date

        for(File a_f : arrfile) // for printing files we use for each loop
        {
            filedate.setTime(a_f.lastModified()); // for displaying time of each file(lastModifies time)

            String content = a_f.isDirectory()? "<DIR>" : " " + a_f.length();     // just for displying file better 
            System.out.println(filedate + "\t" + content + "\t" + a_f.getName());
        }

        

    }    
}
