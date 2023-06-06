class Student {
    String name;
    int rollNo;
    float marks;
    String grade;

    void setname(String nm){
        name = nm;
    }
    String getname(){
        return name;
    }
    void setRollno(int rn){
        rollNo = rn;
    }
    int getRollno(){
        return rollNo;
    }
    void setmarks(float m){
        marks = m;
    }
    float getmarks(){
        return marks;
    }

    String getGrade(){
        if(marks<35)
            return "PASS";
        return "FAIL";
    }

    public static void main(String[] agrs){
        Student s = new Student();  // s is the reference of new student(called object)
        s.setname("rajesh");
        s.setRollno(101);
        s.setmarks(50);

        System.out.println("Name: "+ s.getname());
        System.out.println("RollNo: "+ s.getRollno());
        System.out.println("Marks: "+ s.getmarks());
        System.out.println("Grade: "+ s.getGrade());
    }

}
