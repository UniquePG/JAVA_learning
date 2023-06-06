class Rectangle {
    int len;
    int wid;

    public void set(int l , int w){
        len = l;
        wid = w;
    }

    public String toString()    // We can also modified toString() Method by yourself(it the method of object_class)    (We can call it by only class object)
    {
        String msg;
        msg = "Length: " + len + " Width: " + wid;

        return msg;
    }
    public void print(){
        System.out.println("Length: "+ len);
        System.out.println("Width: "+ wid);
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle();

        r.set(10, 20);
        // r.print();      // it class print methord

        // System.out.println(r);  // (Before modifing ToString() Methord)it automaticaly call ToString() methord of Object_class (it returns "Class_name@ Hash_code")

        // System.out.println(r.toString());   // It also return same -> "Class_name@ Hash_code"

        System.out.println(r);  // It class automaetically toString() Methord




    }
}
