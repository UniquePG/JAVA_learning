import java.io.*;
import java.sql.Struct;

class Book implements Serializable{
    int isbn;
    String bookName;
    String author;

    public Book(int isbn, String bookName, String author){
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
    }

    public String toString(){

        return isbn + " -> "+ bookName + " -> "+ author;
    }
}

class p2_objectReadWrite {
    public static void main(String args[]){
    try{
        // Write data into file (object)
        FileOutputStream fos = new FileOutputStream("D:\\coding\\java\\demo file\\book.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Book b[] = new Book[5];

        b[0] = new Book(121,"java", "ranjan raju");
        b[1] = new Book(122,"c", "praksah");
        b[2] = new Book(125,"c++", "arihant");
        b[3] = new Book(127,"python", "gauri sankar");
        b[4] = new Book(127,"python", "gauri sankar");

        for(int i=0; i<5; i++)
            oos.writeObject(b[i]);

        oos.flush();
        oos.close();
        fos.close();

        // read from file
        Book b1;
        FileInputStream fis = new FileInputStream("D:\\coding\\java\\demo file\\book.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        while(fis.available() > 0){
            b1 = (Book) ois.readObject();
            System.out.println(b1);
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }    
}
