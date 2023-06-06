import java.lang.*;

public class C11_abstract_P {
    public static void main(String ar[]){
        FountainPen f = new FountainPen();
        f.Write();
        f.Refil();
        f.changenip();
    }
}

abstract class pen
{
    abstract void Write();

    abstract void Refil();
}

class FountainPen extends pen
{
    void Write(){
        System.out.println("Write in Fountain Pen");
    }

    void Refil(){
        System.out.println("Refil in Fountain Pen");
    }

    void changenip(){
        System.out.println("Changing the nip");
    }

}
