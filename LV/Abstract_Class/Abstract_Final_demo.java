class Abstract_Final_demo {
    public static void main(String[] arg){

        Derived d = new Derived();

        d.f();
        d.g();
        d.h();
    }
}

abstract class Base     // We can not class final if there is any abstract method 
{
    abstract public void f();   // abstract method does not have its implementaion in abstract class(abstract method only declaired as abstract)

    final public void g(){      // final method can not overided
        System.out.println("G called....");
    }

    public void h(){
        System.out.println("H from Base called....");
    }

}

class Derived extends Base{

    //Abstract method implemented in its 'sub_class'
    public void f(){
        System.out.println("F called....");
    }

    public void h(){
        System.out.println("H from derived called....");
    }
}
