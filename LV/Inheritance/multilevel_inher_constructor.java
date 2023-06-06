class multilevel_inher_constructor {
    public static void main(String[] args){
         C objc = new C(30);

    }
}

class A{

   /*  public A()       // Default constructor 
   {
        System.out.println("A Constructor called");
    } */

    public A(int i){
        i = 10;
        System.out.println("A Constructor called "+ i);
    }
}

class B extends A{

 /*    public B(){
        System.out.println("B Constructor called");
    } */
    public B(int j){
        // j = 20; 
        super(20);
        System.out.println("B Constructor called " + j);
    } 
}

class C extends B{
    
  /*   public C(){
        System.out.println("C Constructor called");
    } */

     public C(int k){
        //  k = 30;
        super(20);
         System.out.println("C Constructor called "+ k);
     }
}
