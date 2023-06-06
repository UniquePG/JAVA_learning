import java.util.*;

class Book{
    int B_id;
    String B_name;
    String author, publisher;

    public Book(int B_id, String B_name, String author, String publisher){
        this.B_id = B_id;
        this.B_name = B_name;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString(){
        return B_id +" -> "+ B_name +" -> "+ author +" -> "+ publisher;
    }

    // override equals method
    public boolean equals(Object o){    
        return (this.B_id == ((Book)o).B_id);   // we have to typecase from "Object" to "Book"
    }
    
    // override hashcode method
    public int Hashcode(){
        return B_id;        
    }

}

class Hashset_demo {
    public static void main(String [] args) {
        
        HashSet<Book> hs = new HashSet<Book>(); // Create Hashset (Element ordering not maintained)
        // LinkedHashSet<Book> lhs = new LinkedHashSet<Book>(); // Create LinkedHashset (Element ordering maintained)
        
        // make some books 
        Book b1 = new Book(101, "c language", "ramachari", "BVB publisher");
        Book b2 = new Book(102, "c++ language", "Raju tyagi", "RSH publisher");
        Book b3 = new Book(103, "Concepts of oops", "Binod jain", "Oxford publisher");
        Book b4 = new Book(104, "concepts of java", "Bhushan trivedi", "JVM publisher");
        
        // add books into Hashset
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        hs.add(b4);

        //Prints book using for-each loop
        for(Book d: hs)
            System.out.println(d); 
            
        // Check duplicate allow or not
        Book b5 = new Book(104, "concepts of java", "Bhushan trivedi", "JVM publisher");
        // By default it compares hashcode of the object (so we have to override hashcode also) it is not go to equals method

        hs.add(b5);    // Here duplicate add into set (as it compares object hashset) [we override "equals(object o)" methord]
        hs.add(b3);    // it not added because b3 already added 

        System.out.println("Print using iterator, After adding same data");
        Iterator <Book> itr = hs.iterator();

        while(itr.hasNext()){
            Book r = itr.next();
            System.out.println(r);
        }

        // Make a hashset of primitive type
        HashSet<Integer> ihs = new HashSet<Integer>();

        ihs.add(10);
        ihs.add(13);
        ihs.add(15);
        ihs.add(12);
        ihs.add(12);    // In Integer(primitive) duplicate automatically not allowed(We dont need to write equals method for this)


        System.out.println("Print integer hashset");
        for(int i : ihs)
            System.out.println(i);
    }
    
}