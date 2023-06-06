public class InheritanceDemo2 {
    public static void main(String[] args){
        person p1 = new person();
        Employee e1 = new Employee();
        FullTimeTemployee ft1 = new FullTimeTemployee();
        PartTimeEmployee pt1 = new PartTimeEmployee();

        p1.setperson("Rejesh", "Gujrat");
        e1.setEmployee("Farukh", "ullasnagar", "E1021", "Account");
        ft1.setFTemployee("prakhar", "Gwalior", "E2011", "Technical", 65000);
        pt1.setPTemployee("Gopal", "Surat", "E3013", "HR", 1500, 20);

        System.out.println("Person.......");
        p1.printperson();
        System.out.println("Employee........");
        e1.printEmployee();
        System.out.println("Full Time Employee........");
        ft1.printFTemployee();
        System.out.println("Part Time Employee........");
        pt1.printPTemployee();
    }
}

class person    
{
    protected String name;
    protected String address;

    public void setperson(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void printperson(){
        System.out.println("Name: "+ name);
        System.out.println("Address: "+ address);
    }
}

class Employee extends person
{
    protected String Empid;
    protected String department;

    public void setEmployee(String name, String address, String Empid, String department){
        setperson(name, address);
        this.Empid = Empid;
        this.department = department;
    }

    public void printEmployee(){
        printperson();
        System.out.println("Employee ID:"+ Empid);
        System.out.println("Employee department:"+ department);
    }
}

class FullTimeTemployee extends Employee
{
    protected double salary;

    public void setFTemployee(String name, String address, String Empid, String department, double salary){
        setEmployee(name, address, Empid, department);
        this.salary = salary;
    }

    public void printFTemployee(){
        printEmployee();
        System.out.println("Employee Salary: "+ salary);
    }
}

class PartTimeEmployee extends Employee     // Hierarical inheritance
{
    private int perhour;
    private int hour;

    public void setPTemployee(String name, String address, String Empid, String department, int perhour, int hour){
        setEmployee(name , address, Empid, department);
        this.perhour = perhour;
        this.hour = hour;
    }
    public void printPTemployee(){
        printEmployee();
        System.out.println("Perhour Rs. : "+ perhour);
        System.out.println("Hour: "+ hour);
        System.out.println("Total Income of PTEmployee: "+ perhour * hour);
    }
}
