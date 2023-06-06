class Problem1 {
    public static void main(String arg[]){
        Airplane ap1;
        Airplane ap2;
        Airplane ap3;
        ap1 = new B747();
        ap2 = new B757();
        ap3 = new B767();

        ap1.getdetails(250, "E3021");
        ap2.getdetails(370, "E3037");
        ap3.getdetails(187, "E3043");

        System.out.println("Airplan: "+ ap1.getClass().getName() +" "+ap1);
        System.out.println("Airplan: "+ ap2.getClass().getName() +" "+ap2);
        System.out.println("Airplan: "+ ap1.getClass().getName() +" "+ap3);
    }    
}

abstract class Airplane{
    int Passangers;
    String SerialNo;

    public void getdetails(int Passangers, String SerialNo){
        this.Passangers = Passangers;
        this.SerialNo = SerialNo;
    }

}

class B747 extends Airplane
{
    public void getdetails(int Passangers, String SerialNo){
        super.getdetails(Passangers, SerialNo);
    }

    public String toString(){
        return "Setting capacity: "+ Passangers + " Serial No: "+ SerialNo;
    }
}

class B757 extends Airplane
{   
    public void getdetails(int Passangers, String SerialNo){
        super.getdetails(Passangers, SerialNo);
    }

    public String toString(){
        return "Setting capacity: "+ Passangers + " Serial No: "+ SerialNo;
    }
}

class B767 extends Airplane
{
    public void getdetails(int Passangers, String SerialNo){
        super.getdetails(Passangers, SerialNo);
    }

    public String toString(){
        return "Setting capacity: "+ Passangers + " Serial No: "+ SerialNo;
    }
}


