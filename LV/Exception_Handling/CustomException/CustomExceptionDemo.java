import java.util.*;

class InvalidRollnoException extends Exception // Exception class should be inherited to make Exception(Checked)[It must be handled or Throws in methord or main methord]
{
    public String toString(){

        return "Roll no should be range 1 to 75";
    }
}
class Student {
    int rollno;
    String name;

    public Student(int rollno, String name){

         try{
            if(rollno <= 0 || rollno >= 75){
                throw new InvalidRollnoException();     // throw custom exception(With new keyword)
            }
            this.rollno = rollno;
            this.name = name;
        }
        catch(InvalidRollnoException ire){
            System.out.println("InvalidRollnoException: "+ire);
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter roll no and name");
        int r = sc.nextInt();
        String nm = sc.next();

        Student s = new Student(r, nm);
        System.out.println("One object is created");
    }
}

/* 
 Two method to handle Checked exception-

1) use try-catch block to where exception is occured 
2) or we Throws exception in that method or in the main method (using throws keyword) 
 */