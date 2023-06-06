class Rectangle2 implements Cloneable   // we have to always write implements cloneable in class name
{
    int length;
    int width;

    public Rectangle2(int length, int width){
        this.length = length;
        this.width = width;
    }

    public String toString(){
        return "Length: " + length + " Width: "+ width;
    }

    public static void main(String args[]){
        Rectangle2 r1 = new Rectangle2(10, 15);

        // Rectangle2 r2 = r1;     // r1 and r2 both are same referance
        // Rectangle r2 = r1.clone();  // clone() Method default returns object we have to cast it to class object

    try{ // if we want to clone a object then always we have to write it in the "try" block

        Rectangle2 r2 = (Rectangle2) r1.clone();    // It thorw a clone not supported exception (so we make try and catch block)


        System.out.println("Values in R1"+ r1);
        System.out.println("Values in R1"+ r2);

        r2.length = 35;
        System.out.println("After modification r2 length");
        
        System.out.println("Values in R1"+ r1);
        System.out.println("Values in R1"+ r2);

         }
         catch(CloneNotSupportedException ce){
             System.out.println(ce);}       
    }
}
