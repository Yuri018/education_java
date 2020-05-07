
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NumberOfYears {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar(1968, Calendar.OCTOBER, 23);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE - dd.MM.yyyy - MMM");

        String oneDay = dateFormat.format(calendar.getTime());
        Date date = new Date();

        System.out.println(oneDay);
        System.out.println(dateFormat.format(date));

    }
}
