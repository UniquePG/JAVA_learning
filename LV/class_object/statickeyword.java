public class statickeyword {
    public static void main(String[] args){
        Student.setpassingmarks(40);   // we set passing marks before creating objects

        Student s1 = new Student();
        Student s2 = new Student();

        s1.set(101, 75);
        s2.set(102, 30);

        s1.display();
        s2.display();

    }
}

class Student{
    int rollno;
    static int passmarks;
    int marks;

    public static void setpassingmarks(int pm){
        passmarks = pm;
    }

    public void set(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    public void display(){
        System.out.println("Roll no: "+ rollno);
        if(marks < passmarks){
            System.out.println("Your marks is: " + marks + ", Grade : FAIL");
        }
        else{
            System.out.println("Your marks is: " + marks + ", Grade : PASS");
        }
    }
}
