import java.io.*;

import javax.lang.model.util.ElementScanner14;

// We have to filter filelisting with extension of the files

// We implements FilenameFilter interface 
class FilterExt implements FilenameFilter   

{
    String ext;     // ext means extension(extionsion of file)

    public FilterExt (String ext)   // make a constructor of FilterExt
    {
        this.ext = ext;
    }

    // accept() is the method of the filenamefilter interface
    public boolean accept(File dir, String name)    // it takes file directory and name(as arguement)
    {
        return name.endsWith(ext);  // endsWith() is the methord of String class
        //(it checks end[extension] of he string[file] )
    }
}
class File_listing_Demo2 {
    public static void main(String[] args){
        FilenameFilter obj_fnf = new FilterExt("cpp");  // give the extension that to be checked

        String dirname = args[0];   // take directory by commandline arguements

        File mydir = new File(dirname);   // File class arguement bala(filter bala)

        if(mydir.isDirectory()){
            File [] arrfile = mydir.listFiles(obj_fnf);    // use of listfiles() method (with filter[in argurment])

            for(File a_f : arrfile)     // printing directory elements
            {
                System.out.println(a_f.getName());  
                System.out.println("Total: "+ arrfile.length);

            }
        }
        else
            System.out.println("Not a directory");



    }
}
