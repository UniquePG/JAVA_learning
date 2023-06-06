class thisKeyword {
    public static void main(String[] args){
        demo d = new demo(25);
        d.printd();
    }
}

class demo{
    int i;

    demo(int i)
    {
        this.i = i;     // this.i(class ka i) = i(parameter bala i0)
    }

    void printd(){
        System.out.println(i);
    }
}

/* 
 * this keyword uses--
 * 1) To refer current class variable/method  (when class variable and argument has same name then this keyword is use to determine class variable)
 * 
 * 2) to invoke current class constructor
 * 
 * 3) To return current class instance(variable/method)
 * 
 */