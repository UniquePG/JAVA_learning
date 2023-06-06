public class InheritanceDemo {
    public static void main(String[] args){
        Employee e1 = new Employee();
        FulltimeEmployee ft1 = new FulltimeEmployee();

        e1.setEmployee(101, "Rahul");
        ft1.setFTemployee(105, "Mohit", 20000);

        e1.printEmployee();
        ft1.printFTemployee();

        ft1.setEmployee(102, "Mukul");
        ft1.printEmployee();
    }
}

class Employee      // Base class
{
    private int empid;
    private String Ename;

    public void setEmployee(int empid, String Ename){
        this.empid = empid;
        this.Ename = Ename; 
    }

    public void printEmployee(){
        System.out.println("Employee ID: "+ empid);
        System.out.println("Employee Name: "+ Ename);
    }
}

class FulltimeEmployee extends Employee    // derived class
{
    private double Salary;

    public void setFTemployee(int empid, String Ename, double Salary){
        setEmployee(empid, Ename);
        this.Salary = Salary;
    }

    public void printFTemployee(){
        printEmployee();
        System.out.println("Full time Employee Salary: "+ Salary);
    }
}
