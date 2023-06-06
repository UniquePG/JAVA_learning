package mypack1;        // In mypack1 package

// We make class(samepackStandAlone) public So we have to make java file name same as class name

public class samepackStandAlone   // We make another class(samepackStandAlone) public in the package mypack1
{
    public void set(){
        AccessSpecifier_pack obj = new AccessSpecifier_pack();
   // obj.pri_i = 10;   // private members not accessible in standalone class
    obj.def_i = 20;
    obj.pro_i = 30;
    obj.pub_i = 40;
    }
}
