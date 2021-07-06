import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateWork {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //varianten von java 8

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);

        LocalDate myDay = LocalDate.of(1968, 10, 23);
        System.out.println(myDay.plusYears(52));

        LocalDateTime timeInNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(timeInNewYork);

        String dateString = "23.10.1968";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDateParse = LocalDate.parse(dateString, dateTimeFormatter);
        System.out.println(localDateParse);

        //Formatierungsoptionen
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println(localDateTime3.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(formatter2.format(localDateTime2));
    }
}
