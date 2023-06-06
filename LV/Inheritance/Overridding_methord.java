import javax.sound.sampled.SourceDataLine;

class Overridding_methord {
    public static void main(String []  args){
        // Base b = new Base();
        // derived d = new derived();

        Base b = new derived();    // b reference of Base class but b is the object of the derived class(It is valid)

// from b we call the derived class functions   (It is called runtime polymorphism)
        b.print();      // call base methord
        // d.print();      // call derived methord
    }
}

class Base{

    protected void print(){
        System.out.println("Hello from Base");
    }
}

class derived extends Base{

    protected void print()      // print() Methord Overridded
    {
        System.out.println("Hello from Derived");
    }
}
