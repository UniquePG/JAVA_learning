import java.util.Scanner;

class runTime_polymorphism {
    public static void main(String[] args){

    // Example of runtime Polymorphism
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Batsman and 2 for Bowler");
        int choice = sc.nextInt();

        Cricketer c; // It is decided at runtime that c will be object of which class(batsman or bowler)
        if(choice == 1){
                c = new Batsman("India", "Rohit Sharma", 36, 29);
        }
        else
            {
              c = new Bowler("India", "Jaspreet Bumrah", 110, 1230);
            }

             c.print();
    }
}

class Cricketer{
    protected String Cname;
    protected String Pname;

    public Cricketer(String Cname, String Pname){
        this.Cname = Cname;
        this.Pname = Pname;
    }

    public void print(){
        System.out.println("County Name: "+ Cname);
        System.out.println("Player Name: "+ Pname);
    }
}

class Batsman extends Cricketer{
    protected int no50s;
    protected int no100s;

    public Batsman(String Cname, String Pname, int no50s, int no100s){
        super(Cname, Pname);
        this.no50s = no50s;
        this.no100s = no100s;
    }

    public void print(){
        super.print();
        System.out.println("No of 50s: "+ no50s);
        System.out.println("No of 100s: "+ no100s);
    }
}

class Bowler extends Cricketer{
    protected int wickets;
    protected int runGiven;

    public Bowler(String Cname, String Pname, int wickets, int runGiven){
        super(Cname, Pname);
        this.wickets = wickets;
        this.runGiven = runGiven;

    }

    public void print(){
        super.print();
        System.out.println("Wickets Taken: "+ wickets);
        System.out.println("Run Given: "+ runGiven);
    }
}

