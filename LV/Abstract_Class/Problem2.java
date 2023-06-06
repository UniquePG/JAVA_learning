class Problem2 {
    public static void main(String [] args){
        Mammal m1[];

        m1 = new Bear();
        m2 = new Elephant();
        m3 = new Horse();
        m4 = new Lion();
    }    
}

abstract class Mammal
{

}

interface Vehicle
{
    public void drive();
}

class Bear extends Mammal
{
    public void drive(){
        System.out.println("Drive methord of Bear");

    }
}
class Elephant extends Mammal implements Vehicle
{
    public void drive(){
        System.out.println("Drive methord of Elephant");
    }
}
class Horse extends Mammal  implements Vehicle
{
    public void drive(){
        System.out.println("Drive methord of Horse");
    }
}
class Lion extends Mammal
{
    public void drive(){
        System.out.println("Drive methord of Lion");

    }
}
