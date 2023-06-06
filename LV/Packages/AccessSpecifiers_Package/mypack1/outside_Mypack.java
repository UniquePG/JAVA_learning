import mypack1.AccessSpecifier_pack; 

class outside_Mypack extends AccessSpecifier_pack {
    public void set(){
       // pri_i = 10;   
       // def_i = 20;   // default members not accessed outside the package
        pro_i = 30;     // protected members accessible outside package only in inherited class
        pub_i = 40;
    }
}

class AnotherpackStandalone{
    public void set(){
        AccessSpecifier_pack obj = new AccessSpecifier_pack();
           // obj.pri_i = 10;   // private members not accessible in standalone class
           // obj.def_i = 20;
           // obj.pro_i = 30;   // Default and protected member not accessible outside package (in stand alone class)

            obj.pub_i = 40;
    }
}
