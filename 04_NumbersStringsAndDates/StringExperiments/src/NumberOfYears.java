
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NumberOfYears {
    public static void main(String[] args){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - день недели - EEEE");
        Calendar birthday = new GregorianCalendar(1968, Calendar.OCTOBER, 23);
        Calendar currentDay = new GregorianCalendar();

        int a = birthday.get(Calendar.YEAR);
        int b = currentDay.get(Calendar.YEAR);
        int c = b - a;

        System.out.println("День рождения: " + dateFormat.format(birthday.getTime()));
        System.out.println("Сегодня: " + dateFormat.format(currentDay.getTime()));

        for (int i = 0; i < (c); i++){
            birthday.set(Calendar.YEAR, (a + i));
            System.out.println("Возраст: " + i + ". Дата: " + dateFormat.format(birthday.getTime()));
        }
    }
}
