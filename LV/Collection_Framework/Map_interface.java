import java.util.*;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Student(){}
    public String toString(){

        return rollno + "-> "+ name;
    }


}

class Map_interface {

    // Map interface implements by concreate class Hashmap
    public static void main(String args[]){

        Student s1 = new Student(101, "Sonal");
        Student s2 = new Student(102, "Golu");
        Student s3 = new Student(103, "Rohan");
        Student s4 = new Student(104, "pragti");

        // Map<key, value>
        Map<Integer, Student> mp = new HashMap<Integer, Student>(); //(We also use hashmap instead of map) Hashmap is a comcrete class of Map

        mp.put(1, s1);
        mp.put(2, s2);
        mp.put(3, s3);

        // print the elements of map
        System.out.println("prints the elements of the map using getmethord");

        for(int i =0; i<mp.size(); i++){
            Student s;
            s = mp.get(i+1);    // our keys starts with 1 not 0 (so we take i+1) 
            System.out.println(s);
        }

        // keyset() method
        System.out.println("All the key are: "+ mp.keySet());   // direct print all key set

       /*  Set mp_key = mp.keySet();   // store all keys in the seprate set variable and then print
        System.out.println("All keys are: "+ mp_key);   
        */ 

        // keyvalues() method
        System.out.println("All the value are: "+ mp.values());

        // insert value at existing key using put() method
        System.out.println("Insert s4 at key 2");
        mp.put(2, s4);          // we do insert and update both using put method
        System.out.println(mp); 

System.out.println("\n");
        // Entryset() methord-> it returns entrys in the map(keys and values)

       Set<Map.Entry <Integer, Student>> entry_colg =  mp.entrySet();    // Set hoga Map.Entry Type ka & each Map.Entry hogi <Integer,Student> Type ke  [Because entrySet , Map.Entry return karta hai Set type ka]

       Iterator<Map.Entry<Integer, Student>> itr = entry_colg.iterator();   // make a iterator to iterate entry_set

        while(itr.hasNext()){
           Map.Entry<Integer, Student> mp_pair =  itr.next();

           Integer ikey = mp_pair.getKey();     // fetch key (Integer type) 
           Student s = mp_pair.getValue();      // fetch value (Student type)
        
           System.out.println("Key: "+ ikey +"  -----  " + "value: "+ s);   // print keys and values of the map

        }
System.out.println("\n");
        System.out.println("Is map Empty: "+ mp.isEmpty());



    }    
}
