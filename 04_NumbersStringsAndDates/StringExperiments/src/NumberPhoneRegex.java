import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneRegex {
    public static void main(String[] args) {

        System.out.println("Введите номер телефона в любом формате: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String regex = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3,4}\\)?[\\- ]?)?[\\d\\- ]{5,10}$";
//        String regex =   "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
