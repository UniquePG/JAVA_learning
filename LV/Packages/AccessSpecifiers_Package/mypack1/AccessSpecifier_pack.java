package mypack1;

public class AccessSpecifier_pack   // If we make a class "public" then the "java file name" should be "same as class name"
{
    private int pri_i;
    int def_i;
    protected int pro_i;
    public int pub_i;

    public void set(){
        pri_i = 10;
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }
}

class samepackDerived extends AccessSpecifier_pack{
    public void set(){
       // pri_i = 10;   // private member not accessible in inherited class
        def_i = 20;
        pro_i = 30;
        pub_i = 40;
    }
}

// We can not make "more than one classes" public in the same package file
// If we want to make another class public in the same package then -> we will create another java file of the same package and make class public

/* 
public class samepackStandAlone    
{
    public void set(){
        AccessSpecifier_pack obj = new AccessSpecifier_pack();
   // obj.pri_i = 10;   // private members not accessible in standalone class
    obj.def_i = 20;
    obj.pro_i = 30;
    obj.pub_i = 40;
    }
}

 */