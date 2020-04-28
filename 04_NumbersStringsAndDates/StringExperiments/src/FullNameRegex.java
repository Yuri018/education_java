import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество: ");
        String text = scanner.nextLine();

        String[] wordArray = text.split("\\s*(\\s|,|!|\\.|[0-9])\\s*");

        if (wordArray.length != 3){
            System.out.println("Данные введены неверно");
            return;
        }

        System.out.println("Фамилия: " + wordArray[0]);
        System.out.println("Имя: " + wordArray[1]);
        System.out.println("Отчество: " + wordArray[2]);

    }
}
