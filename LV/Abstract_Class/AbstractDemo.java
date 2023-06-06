import java.util.Scanner;

class AbstractDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Dog and 2 for Cat");
        int choice = sc.nextInt();

        // Animal a = new Animal();    //  this is generated an error(we can not make object of abstract class)
        
        Animal a;      // We can make only reference of the class Animal (which is abstract class)
        if(choice == 1)
            a = new Dog();
        else
            a = new Cat();

        a.makesound();
    }
}

abstract class Animal   // We can not make object of abstract class
{
   abstract public void makesound();    // A method which dont have any logic that is abstract method

}

abstract class petAnimal extends Animal
{
    public void gettype(){
        System.out.println("this is pet animal");
    }
}

class Dog extends petAnimal{
    public void makesound(){
        System.out.println("Bow....Bow");
    }
}

class Cat extends petAnimal{
    public void makesound(){
        System.out.println("Meow....Meow");
    }

}

/*
    If we make a abstract class and there is any abstract_method 
then
    we can not not make any class(derived class) who does not have those abstract_method

 */
