import java.util.*;

// Sorted set implemented by Treeset
class Student implements Comparable{    // Must have implements comparable (if we made generic treeset)
    int rollno;
    String name;

    public int compareTo(Object o){
        Student s = (Student) o;
        
        // return rollno.compareTo(s.rollno);

        if(this.rollno == s.rollno)     // it compares rollno. for Sorting in the treeSet(Generic me)
            return 0;
        else if(this.rollno < s.rollno)
            return -1;
        else
            return 1;

        
    }

    public Student (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){

        return rollno + "->" + name;
    }
}
class SortedSet_demo {
    public static void main(String [] args){

        TreeSet<Student> st = new TreeSet<Student>();   // make a generic tree set Student type

        // instensiate some students 
        Student s1 = new Student(101, "Rohit");
        Student s2 = new Student(102, "Golu");
        Student s3 = new Student(103, "Binod");
        Student s4 = new Student(104, "Priti");
        Student s5 = new Student(105, "Rakhi");
        Student s6 = new Student(110, "harish");
        Student s7 = new Student(108, "prekha");

        st.add(s1);
        st.add(s4);
        st.add(s5);
        st.add(s2);
        st.add(s3);

        System.out.println("printing students");
        System.out.println(st);// student arrange in sorted order of rollno (as written in compareTo())

        System.out.println("After adding two more students");
        st.add(s7);
        st.add(s6);
        System.out.println(st);



    

    /*     TreeSet<Integer> ts = new TreeSet<Integer>();   // make a treeset of the Integer

        ts.add(12);
        ts.add(54);
        ts.add(30);
        ts.add(21);
        ts.add(44);

        // Print treeset
        System.out.println(ts);     // it stores in Sorted order always

        System.out.println("After adding more numbers");
        ts.add(51);
        ts.add(44);     // duplicate are not allowed in it
        System.out.println(ts);

        // Demonstrate more method or Treeset(SortedSet)
            // headset(ele)
        TreeSet<Integer> header =  (TreeSet<Integer>) ts.headSet(30);  // 30 se kam baale sare element milenge header ke ander
        System.out.println("Printing Header elements");
        System.out.println(header);

            // tailset(ele)
        TreeSet<Integer> tail = (TreeSet<Integer>) ts.tailSet(44);  // element 44 se end tk ke element
        System.out.println("Printing Tail elements");
        System.out.println(tail);

            //first(), and last() method
        System.out.println("Printing first element");
        System.out.println(ts.first());
        System.out.println("Printing last element");
        System.out.println(ts.last());

     */    


    }
}
