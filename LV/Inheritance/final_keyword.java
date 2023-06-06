public class final_keyword {
    public static void main(String args []){
            Base b = new Base();
            derived d = new derived();

            b.print();
            d.print();
    }
}

class Base              // We can not inherited class when we use final keyword with class
{
    protected final int i;


    public Base()
    {
        i = 10;
    }
    public void print()      // We can not Override a methord when we use final keyword
    {
       // i = i*2;        // we can not change final variable value later
        System.out.println(i);
    }
}

class derived extends Base{
    protected int j;

    public void print(){
        super.print();
    }
}
