import java.io.*;

class Student implements Serializable{
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public String toString(){

        return rollno + " -> "+ name;
    }
}
class ObjectReadWrite {
    public static void main(String args[]){
        // ObjectOutputStream (put object data into the file)[write in file]
/*     try{
        FileOutputStream fos = new FileOutputStream(args[0]);
        ObjectOutputStream oos = new ObjectOutputStream(fos); // pass the file object

        // make student 
        Student s[] = new Student[5];

        s[0] = new Student(101, "Golu");
        s[1] = new Student(102, "madhav");
        s[2] = new Student(104, "gopal");
        s[3] = new Student(105, "prem");
        s[4] = new Student(106, "rashmi");

        //put Student object in the file
        for(int i=0; i<5; i++){
            oos.writeObject(s[i]);
        }

        oos.flush();
        oos.close();
        fos.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        } */

    // ObjectInputStream(Read from the file)
    

    try{
            Student s;
        FileInputStream fis = new FileInputStream(args[0]);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // print object form the file

        while(fis.available() > 0){
            s = (Student) ois.readObject();
            System.out.println(s);
        }
        
        fis.close();
        ois.close();
    }catch(IOException ioe){
        ioe.printStackTrace();
    }
    catch(ClassNotFoundException cnfe){
        cnfe.printStackTrace();
    }
    
    }
}
