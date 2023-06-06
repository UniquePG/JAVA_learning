import javax.management.DescriptorAccess;

public class constructor_inheritance {
    public static void main(String[] args){
        // derived objd = new derived();   // Both Base class and Derived class Default constructor called when we make derived class object

        derived objd = new derived(28, 49);     // called derived call constructor

        objd.printIJ();
    }
}

class Base{
    protected int i;

/*     public Base()       // Default constructor
    {
        System.out.println("Base class Default constructor called");

    }
     */
    public Base(int i){
        System.out.println("Base parametrized contructor called");
        this.i = i;
    }

    public void printI(){
        System.out.println(i);
    }
}

class derived extends Base
{
    protected int j;
/* 
    public derived()        // Default constructor
    {
        System.out.println("Derived class constructor called");
        j = 30;
    }
     */

    public derived(int i, int j)    // Derived paramiterized contructor
    {
        super(i);       // Call base call constructor only on the first line of the derived constructor
        System.out.println("Derived paramiterized constructor called");
        this.j = j;
    }
    public void printIJ(){
        System.out.println("I: "+ i);
        System.out.println("J: "+ j);
    }
}