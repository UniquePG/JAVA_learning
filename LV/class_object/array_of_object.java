import javax.sound.midi.Soundbank;

class array_of_object {
    public static void main(String[] args) {

        // make a array of object
        Employee e[];
        e = new Employee[5];

        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee(); // here address of 5 employee created
        }

        // Access methords for each employee
        for (int i = 0; i < 5; i++) // we can use e.length instead of 5
        {
            e[i].setemployee((i + 100), (7000 * (i + 1)));
        }
        /*
         * for(int i=0; i<5; i++) // we can use e.length instead of 5
         * {
         * e[i].printemployee();
         * }
         */

        e[0].printemployee(); // individualy access each employee
        e[1].printemployee();
        e[3].printemployee();

        for (int i = 0; i < e.length; i++) {
            if (e[i].psalary() < 15000) {
                System.out.println("You get a Bonus of 3000!");
            } else {
                System.out.println("You get a Bonus of 1000!");
            }
        }

    }
}

class Employee {
    private int empId;
    private float salary;

    public void setemployee(int id, float sal) {
        empId = id;
        salary = sal;
    }

    public void printemployee() {
        System.out.println(" Employee id is: " + empId + ", Employee salary: " + salary);
    }

    public float psalary() {
        return salary;
    }

}
