public class staticInitilizerblock {

    private int i =0;   // non static variable
    static int j = 0;   // static variable

    staticInitilizerblock()     // Constructor
    {
        i++;
        System.out.println(" Inside constructor(with value i): "+ i);
    }

    // Initilizer block
    {   
        i++;
        System.out.println(" initilizer block 1(with value i):  "+ i);
    }

    {
        i++;
        System.out.println(" initilizer block 2(with value i):  "+ i);
    }

    // Static initilizer block
    static{
      //  i++;    // it thorows an error (as we can not access nonstatic variable inside static block)

        j++;    // we can acces static variable inside staic block
        System.out.println(" Static initilizer block 1(with value j):  "+ j);
    }

    static{
        j++;
        System.out.println(" Static initilizer block 2(with value j):  "+ j);
    }

    /* 
     Note -> Static initilizer block invoked before the main executed (in order)
     */
    public static void main(String[] args){

        System.out.println(" Main Started ");

        staticInitilizerblock s1 = new staticInitilizerblock();

        System.out.println(" Main End ");
    }
}
