import java.util.function.*;

class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }
    
    public static void main(String args[]){
        Student s = new Student("Priya");
        
        // Consumer interface
        Consumer <Student> updatename = p -> p.setname("Radha"); // here 'p' is the parameter of accept method (which is generic Student type Means->[p == s])

        System.out.println(s.getname());
        updatename.accept(s);       // Call accept(Student obj) method [not return anything]
        System.out.println(s.getname());
    }
}

