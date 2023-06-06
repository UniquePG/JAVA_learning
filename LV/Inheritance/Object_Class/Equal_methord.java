import javax.imageio.stream.FileImageInputStream;

class Rectangle1 {
    int length;
    int width;

    public Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }

     public boolean equals(Object obj)   // modifing equals() methord
    {
        Rectangle1 r = (Rectangle1) obj;    // We must have Cast obj to Class(Rectange)
        if(this.length == r.length && this.width == r.width)        // Values comparison
            return true;
        return false;
    } 

    public String toString(){
        return "Length: "+ length + "width: "+ width;
    }

    public static void main(String args[]){
        Rectangle1 r1 = new Rectangle1(10, 20);
        Rectangle1 r2 = new Rectangle1(10, 20);


        if(r1.equals(r2))       // It is equal (as we manualy modify equals methord)
            System.out.println("Both are Equal");
        else
            System.out.println("Both are different");
        

        // Rectangle1 r3 = r1;     // it is equal (r3 referance equal to r1 referance)

/* 
        if(r1 == r2)     // It does not compare the value of object (it compare the refrances)
            System.out.println("Both are Equal");
        else
            System.out.println("Both are different");
 */

/*         if(r1.equals(r2))       // It is also not equal (Defult behaviour -> as it compares the      hashcode of both obects and the hashcode of different objects are different)
            System.out.println("Both are Equal");
        else
            System.out.println("Both are different");
 */

    /*         String s1 = "Hello";
            String s2 = new String("Hello");

            if(s1==s2)         // It is also diffrent (as s2 is the reference of String)
                System.out.println("Both are Equal");
            else
                System.out.println("Both are different");
     */

        
    }
}


/* 
 * Equal() methord should be-->
 *      1) It should be reflexive ->  R1 = R1 = True
 *      2) It should be Symmetric ->  R1 = R2 = True   / R2 = R1 = True
 *      3) It should be Transitive -> R1 = R2 = True 
 *                                    R2 = R3 = True
 *                                    R1 = R3 = true
 * 
 */
