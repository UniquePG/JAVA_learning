class accessmodifiersdemo{
    public static void main(String[] args){
        Student s;
        s = new Student();

        s.setRollno(102);
        s.setname("Radha");

        // s.lastname;   // We can not access (as it is private)

        System.out.println("Roll No: "+ s.getRollno());
        System.out.println("Name: "+ s.getname());
    }
}

class Student{
    private int rollno;
    private String name;
   // private String lastname;
    

    public void setRollno(int r){
        if(r >= 101 && r <= 170)
        rollno = r;
        else{
            System.out.println("Roll number is not within the range");
        }
    }
    public int getRollno(){
        return rollno;
    }
    public void setname(String nm){
        name = nm;
    }
    public String getname(){
        return name;
    }


}