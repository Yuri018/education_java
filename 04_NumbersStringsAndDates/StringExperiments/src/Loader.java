import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Loader
{
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("-------------------------------------------------");
        ZoneId timeZone = ZoneId.of("Europe/Moscow");
        LocalDate today = LocalDate.now(timeZone);
        System.out.println(today);
        System.out.println("-------------------------------------------------");
        LocalDate birthday = LocalDate.of(1968, Month.OCTOBER, 23);
        System.out.println(birthday);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM.yyyy - EEEE");
        System.out.println(dtf.format(birthday));
        LocalDate text = LocalDate.parse("February-23-2019", dtf);
        System.out.println(text);

        int year = birthday.getYear();
        Month month = birthday.getMonth();//свой метод MONTH для месяцев
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();// тоже свой метод для дней недели
        int day = birthday.getDayOfMonth();
        System.out.println(year + " " + day + " " + month + " " + dayOfWeek);
        LocalDate nextBirthday = birthday.plusYears(1);
        System.out.println("Next birthday " + nextBirthday);

        System.out.println("-------------------------------------------------");
        LocalDate a = LocalDate.ofEpochDay(0);
        System.out.println(a);
        System.out.println("-------------------------------------------------");

        LocalTime time = LocalTime.now();
        System.out.println(time);


    }
}