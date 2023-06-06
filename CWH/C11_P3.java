public class C11_P3 {
    public static void main(String[] arg){
        human h = new human();
        h.jump();
        h.speak();
    }
}

class Monkey{
    void jump(){
        System.out.println("Jump");
    }

    void bite(){
        System.out.println("Bite");
    }
}

class human extends Monkey{
    void speak(){
        System.out.println("human Speak");
    }
}
