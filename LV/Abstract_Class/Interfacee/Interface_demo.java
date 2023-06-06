interface Interface_I   // Interface like a blueprint of the class
 {
    int no  = 10;   // In interface-> all variables are 'final' So we have to initilize it 
    void f();       // In interface-> all methods are 'abstract' So we have to write its logic in implemented class (all methord are public in interface)
}

interface Interface_I2
{
    int no2 = 30;
    void g();
}

/* 
// We can inherit an interface and make new interface

interface Interface_I3 extends Interface_I      
{                                           // For this we use extends keyword

}
*/
class Base 
{
    void h(){
        System.out.println("H is called....");
    }
}

// We can inherited a class and interface together
// "implements" keyword use for inherit 'interface' by a 'class'
class Interface_demo extends Base implements Interface_I , Interface_I2   
{
    public void f(){
        // no = no +1;     // we can not Modify interface variable because it is final
        System.out.println("F is called...."+ no);
    }

    public void g(){
        System.out.println("G is called...."+ no2);
    }

    public static void main(String args[]) {
        Interface_demo obj = new Interface_demo();

        obj.f();
        obj.g();
        obj.h();
    }
}

