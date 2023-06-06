import java.util.Calendar;
import java.util.GregorianCalendar;

class calenderClassDemo {
    public static void main(String args[]){
        // Calendar c = Calendar.getInstance();
        // System.out.println(c);

        Calendar c = Calendar.getInstance();
        // System.out.println(c);

        // System.out.println(c.getTimeZone().getID()); // get id of the time zone

        System.out.println(c.getTime());    // to get the current time

        System.out.println(c.get(Calendar.DATE));   // to get current date
        System.out.println(c.get(Calendar.HOUR));   // to get current hour
        System.out.println(c.get(Calendar.HOUR_OF_DAY));   // to get current date

        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.SECOND));    // hour minute time of the current date

        // Make a gregorian Calender 
        GregorianCalendar gc = new GregorianCalendar(); // Normal calender
        System.out.println(gc.isLeapYear(2020));    // return leap year or not



    }    
}
