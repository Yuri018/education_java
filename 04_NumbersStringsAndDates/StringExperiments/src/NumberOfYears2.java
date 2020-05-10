import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NumberOfYears2 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy - EEEE");

        LocalDate birthday = LocalDate.of(1968, 10, 23);
        LocalDate currentDay = LocalDate.now();
        long years = ChronoUnit.YEARS.between(birthday,currentDay);

        for (int i = 0; i <= years; i++){
            System.out.println("Возраст: " + i + " " + dateTimeFormatter.format(birthday.plusYears(i)));
        }
    }
}
