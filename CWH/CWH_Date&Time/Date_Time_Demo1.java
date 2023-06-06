import java.sql.Date;

class Date_Time_Demo1 {
    public static void main(String args[]){

        System.out.println(System.currentTimeMillis());    // no of miliseconds
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);    // converted into years since 1970

        // System.out.println(Long.MAX_VALUE); // maximum size of Long

        // Use of Date class
    
        Date d = new Date();    // All these are depricated
        System.out.println(d);
        System.out.println(d.getTime());
    }
}
