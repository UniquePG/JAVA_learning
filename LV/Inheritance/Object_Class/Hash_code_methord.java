import java.net.SocketTimeoutException;

class Student {
    int rollno;
    String name;

        public Student(int rollno, String name){
            this.rollno = rollno;
            this.name = name;
        }

    public String toString()    // toString() Methord
    {
        return "Roll NO: "+ rollno + "Name: "+ name;
    }

    public int hashCode()     // ("hashcode()" Methord)we can manually decide hashcode that show after @
    {
        return rollno;
    }

    public static void main(String args[]){
        Student s1 = new Student(101, "Pramod");

        System.out.println(s1);   // it returns "Class_name@hash_code" for student s1(has_code in hexadecimal)
        // System.out.println(s1.hashCode());  // It gives the hashcode in Integer

        // String hash_s1 = String.valueOf(s1.hashCode());      // It conver the int into String

        // System.out.println(Integer.toHexString(s1.hashCode())); // converted integer hashcode into haxadecemal 
        System.out.println(s1.hashCode());  // Now this print decided hascode after "Class_name@..."
       
    }
}
