import java.util.*;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){
        return rollno + "-->" + name;
    }

    public Student(){}  // Default constructor
}

class List_interface{
    static Student [] arr = new Student [10];   // make a array of student 
    static Student s;

    public static void main(String [] args){
        int i;
        // Declair Linked list
        // LinkedList <Student> tab1 = new LinkedList<Student>(); //All operations are same as Arraylist 

        // Declair Array list [Generic Type (Student ke array list)]
        ArrayList <Student> tab1 = new ArrayList<Student>(); // make a array list of Student (generic)

        getdata(arr);  // to add the elements in the array 
        
        // Add elements in the array list
        for(i = 0; i<10; i++){
            tab1.add(arr[i]);    // to add the elements in the ArrayList from the array 
        }

        // Print the elements of the Array list
        System.out.println("Print the elements of the Arraylist[Using get()]");
        for(i =0; i<10; i++){
            System.out.println(tab1.get(i));
        }

System.out.println("\n");

        tab1.add(5, new Student(23, "Dhanush"));     // Add new student at desired index(5)

        System.out.println("Print Arraylist after insert new student Using arraylist name tab1");
        System.out.println(tab1);   // print array list using tab1(reference of the arraylist)

System.out.println("\n");
        // Use of Iterator
        Iterator it = tab1.iterator();  // make a iterator 'it' to iterate Arraylist(without generic)

        System.out.println("Iterate Arraylist using iterator ");
        while(it.hasNext()){
            Student s = (Student) it.next();    //we not make iterator generic So we have to Cast it in Student Type
            System.out.println(s);      // print using object 's'
        }

System.out.println("\n");
        // Use of toArray() Method 
        System.out.println("Copy elements from one object to other object  using toArray() method ");
        // size of obj1 is matters when we use toarray method

//WE check by taking different size
        // Student [] obj1 = new Student[11];  // same size as actual array list has (11)  [then both are same]
        // Student [] obj1 = new Student[15];     // when we increase the size (15)  [then also both are same]
        Student [] obj1 = new Student[5];    //when we decrease the size(5-> not enough for 11 )[then both not same]


        Student [] obj2 = (Student []) tab1.toArray(obj1);  // typecast obj2 in "Student_array[]" and copy all element of obj1 to obj2

        if(obj1 == obj2)
            System.out.println("Obj1 and obj2 are same");
        else
            System.out.println("obj1 and obj2 are not same");

System.out.println("\n");
        // Demonstrate SubList 
        List <Student> subli = tab1.subList(2, 5);    // make a sublist of tab1(Student ke)

        ListIterator <Student> li = subli.listIterator(); // make a list iterator (Generic-> Student type ke) to iterate list

        System.out.println("Forward Traversal of sublist using listiterator");
        while(li.hasNext()){
            // System.out.println(li.next());  // we also do that to traverse 
            
            Student s = li.next();  //We make the list iterator generic[Student type] So here we dont need to typecast it into Student
            System.out.println(s);
        }

        System.out.println("Backward Traversal of sublist using listiterator");
        while(li.hasPrevious()){
            Student s = li.previous();
            System.out.println(s);
        }

System.out.println("\n");
        // Remove a student using Remove() method
        System.out.println("Sublist after Remove the student whose roll no is 14");
        while(li.hasNext()){
            Student s = li.next();
            if(s.rollno == 14)
                li.remove();    // to remove the student
            // System.out.println(s);
        }
        System.out.println(subli);

System.out.println("\n");
        // Remove element from Arraylist 
        tab1.remove(8);     // remove element at index 8 from arraylist tab1
        System.out.println("Array list after remove element at index 8");
        System.out.println(tab1);

    }

    static void getdata(Student [] A){  // arguement me Student type ka array pass kia h

        // fill the elements in the array of student
        A[0] = new Student(11, "raju");
        A[1] = new Student(12, "mohan");
        A[2] = new Student(13, "gopal");
        A[3] = new Student(14, "priya");
        A[4] = new Student(15, "bholu");
        A[5] = new Student(16, "titli");
        A[6] = new Student(17, "golu");
        A[7] = new Student(18, "monu");
        A[8] = new Student(19, "kamal");
        A[9] = new Student(20, "peter");
    }
}