public class super_keyword {
    public static void main(String[] argss){

        derived obj = new derived();
        obj.printIJ();
    }
}

class Base
{
    protected int i;

    Base(){
        i = 10;
    }

    public void printI(){
        System.out.println(i);
    }
}

class derived extends Base
{
    protected int j;

    derived(){
        
        // super.i = 20;      // class immediate parent instance
        // i=20;           // it is also valid

        super();        // Here we called constructor of immediate parent class [Base()]
        j = 30;
    }

    public void printIJ(){
        super.printI();         // call immediate parent methord(function) with super keyword
        System.out.println(j);
    }
}
