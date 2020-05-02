import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneRegex {
    public static void main(String[] args) {

        System.out.println("Введите номер телефона в любом формате: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();



        number = number.replaceAll("[^\\d]", "");
        if (number.length() != 11) {
            if (number.length() < 11) {
                System.out.println("Мало цифр" + " " + number.length());
            }else
                System.out.println("Много цифр" + " " + number.length());
        }
        String formatNumber = number.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                "+7 ($2) $3-$4-$5");
        System.out.println(formatNumber);
    }
 }

