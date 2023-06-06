import javax.sound.sampled.SourceDataLine;

import mypack.*;    // * is used to import all public classes of the package
// import mypack.UD_packageDemo1;  // package_name.Class_name is used to import a particular class

public class UD_packageDemo2 {
    public static void main(String[] args){

        UD_packageDemo1 obj = new UD_packageDemo1(10, 20);  // class "UD_packageDemo1" is public in package mypack so we can use this class
        
        System.out.println(obj);
    }
}
