import java.util.ArrayList;

public class demo4wrapperclass {
    public static void main(String[] args){
        ArrayList <Integer> mynum = new ArrayList<Integer>();  // We dont use <int>, we have to use wrapper class instance <Integer>

        mynum.add(10);
        mynum.add(20);
        mynum.add(30);
        mynum.add(40);

        for(int ele : mynum)
            System.out.println(ele);
    }    
}
