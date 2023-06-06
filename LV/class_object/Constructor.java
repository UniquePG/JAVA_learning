class constructor{
    public static void main(String[] args){
        Student s;
        s = new Student(); 
        Student s1;
        s1 = new Student(105, 76.32f);  //parameterized constructor called
        Student s2;
        s2 = new Student(102);// parametrized constructor with default value called 


        s.printstudent();
        //print values with parametrized constructor
        s1.printstudent();
        // print value with parametrized and one defalue value consructor
        s2.printstudent();


    }
}

class Student{
    private int rollno;
    private float marks;

    Student()   // Default constructor
    {
        rollno = 101;
        marks = 50f;
    }

    Student(int r1)     // parametrized constructor with default value
    {
        rollno = r1;
        marks = 72.21f;
    }
    Student(int r, float m)   // Parametrized constructor
    {
        rollno = r;
        marks = m;
    }

    public void printstudent(){
        System.out.println("RollNo: "+ rollno + " Marks: "+ marks);
    }

}
