import java.time.*;
import java.time.format.DateTimeFormatter;

class date_time_formator {
    public static void main(String args[]){
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        // This is the formate
        DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd||mm||yyyy -- E H:m ");   // Using java docs for more formator

        DateTimeFormatter fd2 = DateTimeFormatter.ISO_LOCAL_DATE;   // inbuild formattor

        String mydate = dt.format(fd);  // Creating date String using date formate
        String mydate2 = dt.format(fd2);  // Creating date String using date formate
        
        System.out.println(mydate);
        System.out.println(mydate2);
    }
}
