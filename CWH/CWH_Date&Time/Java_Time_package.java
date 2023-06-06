import java.time.*;

class Java_Time_package {
    public static void main(String ags[]){
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
    }   
}
