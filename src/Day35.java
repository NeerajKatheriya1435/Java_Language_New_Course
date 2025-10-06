import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Day35 {
    public static void main(String[] args) {
//        LocalDate localDate=LocalDate.now();
//        System.out.println(localDate);
//
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//
//        LocalDateTime localDateTime= LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        ZonedDateTime zonedDateTime=ZonedDateTime.now();
//        System.out.println(zonedDateTime);

        LocalDateTime d1=LocalDateTime.now();
        DateTimeFormatter formatStr=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a");
        String str=d1.format(formatStr);
        System.out.println(str);
    }
}
