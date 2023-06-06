interface I{
    // if we write a logic of method in interface then we have to make it default
   default void f() 
    {
        System.out.println("F is called....");
    }
}

class interface_demo2 implements I
{

    // We can also override the dafault method of interface
    public void f() 
    {
        System.out.println("Overrided interface methord(F is called...)");
    } 
   
    public static void main(String[] ar){
        interface_demo2 obj = new interface_demo2();
        obj.f();

    // We can also call the interface method by its name "if method is static in interface" and "we not override that method"
    
        // I.f();
    }
    
}
