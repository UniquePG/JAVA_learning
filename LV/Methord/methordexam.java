class methordexam {
    public static void f(){
        System.out.println("Inside f.... before calling g()");
        g();
        System.out.println("Inside f.... after calling g()");
        
    }
    public static void g(){
        System.out.println("Inside g.... before calling h()");
        h();
        System.out.println("Inside g.... after calling h()");
        
    }
    public static void h(){
        System.out.println("Inside h");
    }

    public static void main(String[] args){
        System.out.println("Inside Main.... before calling f()");
        f();
        System.out.println("Inside Main.... after calling f()");


    }
}
