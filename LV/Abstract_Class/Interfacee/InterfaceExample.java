import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

class InterfaceExample {
    public static void main(String args[]){
        Vehicle v[] = new Vehicle[4];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.println("Enter 1 to create Bus and 2 to create Aeroplane");
            int choice = sc.nextInt();
            if(choice == 1)     // 1 for create Bus
            {
                int seats;
                String fuel;
                int speed;
                String type;
                System.out.println("Enter seats, fuel, speed and the type of bus");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                type = sc.next();

                v[i] = new Bus(seats, fuel, speed, type);
            }
            else       // 2 for create Aeroplane
            {
                int seats;
                String fuel;
                int speed;
                int takeofspeed;
                System.out.println("Enter seats, fuel, speed and takeofspeed of Aeroplane");
                seats = sc.nextInt();
                fuel = sc.next();
                speed = sc.nextInt();
                takeofspeed = sc.nextInt();

                v[i] = new Aeroplane(seats, fuel, speed, takeofspeed);
            }
        }

        int count =0;
        for(int i=0; i<4; i++){
            
            if(v[i] instanceof FlyingObject){
                count++;
            }
            System.out.println(v[i]);
        }
        System.out.println("\n");
        System.out.println("Total no. of flying object: "+ count);

    }
}

class Vehicle{
    int noSeats;
    String Fuel;
    int Speed;

    public Vehicle(int noSeats, String Fuel, int Speed){
        this.noSeats = noSeats;
        this.Fuel = Fuel;
        this.Speed = Speed;
    }

    public String toString(){
        return "No of seats: "+ noSeats + " Fuel: "+ Fuel + " Speed: "+ Speed;
    }

}

interface FlyingObject  // Interface 
{
    int maxSpeed = 20000;
}

class Aeroplane extends Vehicle implements FlyingObject{
    int takeofSpeed;

    public Aeroplane (int noSeats, String Fuel, int Speed, int takeofSpeed){
        super(noSeats, Fuel, Speed);
        this.takeofSpeed = takeofSpeed;
    }

    public String toString(){
        String aeroprint;
        aeroprint = "Attributes of Aeroplane...\n";
        aeroprint = aeroprint + "No of seats: "+ noSeats + " Fuel: "+ Fuel + " Speed: "+ Speed;
        aeroprint = aeroprint + " takeof Speed: "+ takeofSpeed;
        
        return aeroprint;
    }
}

class Bus extends Vehicle{
    String typeofbus;

    public Bus(int noSeats, String Fuel, int Speed, String typeofbus){
        super(noSeats, Fuel, Speed);
        this.typeofbus = typeofbus;
    }

    public String toString(){
        String busprint;
        busprint = "Attributes of Bus....\n";
        busprint = busprint + " No of seats: "+ noSeats + " Fuel: "+ Fuel + " Speed: "+ Speed;
        busprint = busprint + " Type of Bus: "+ typeofbus;

        return busprint;
    }
}
