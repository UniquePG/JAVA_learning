import java.util.*;

// Unchecked Custom exception
class InvalidRollnoException extends RuntimeException // RuntimeException class should be inherited to make Exception(UnChecked)[It has not need to handle]
{
    public String toString(){

        return "Roll no should be range 1 to 75";
    }
}
class Student1 {
    int rollno;
    String name;

    public Student1(int rollno, String name){

        //  try{
            if(rollno <= 0 || rollno >= 75){
                throw new InvalidRollnoException();     // throw custom exception(With new keyword)
            }
            this.rollno = rollno;
            this.name = name;
        // }
        // catch(InvalidRollnoException ire){
        //     System.out.println("InvalidRollnoException: "+ire);
        // }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter roll no and name");
        int r = sc.nextInt();
        String nm = sc.next();

        Student1 s = new Student1(r, nm);
        System.out.println("One object is created");
    }
}
