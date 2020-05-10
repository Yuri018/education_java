
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NumberOfYears {
    public static void main(String[] args){

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - день недели - EEEE");
        Calendar birthday = new GregorianCalendar(1968, Calendar.OCTOBER, 23);
        Calendar currentDay = new GregorianCalendar();
        int year = birthday.get(Calendar.YEAR);
        int age = 0;

        while (birthday.before(currentDay)){
            birthday.set(Calendar.YEAR, year++);
            System.out.println(age + " " + dateFormat.format(birthday.getTime()));
            age++;
        }
    }
}
