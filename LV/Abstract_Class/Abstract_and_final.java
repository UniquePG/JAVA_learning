class Abstract_and_final {
    public static void main(String arg[]){
        
        FinalClass f1 = new FinalClass();
        f1.f();
    }
}

class FinalClass  // We can not make a class Abstract and final both together 
{
    final public void f(){
        System.out.println("final class instantiated");
    }
}
/* 
class derivedFinal extends FinalClass{
    public void f(){
        System.out.println(" inherited final class instantiated");
    }
} */