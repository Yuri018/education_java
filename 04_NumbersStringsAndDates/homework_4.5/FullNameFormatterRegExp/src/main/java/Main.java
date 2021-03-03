import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            Pattern pattern = Pattern.compile("[А-ЯЁа-яё\\-]\\s+");
            Matcher matcher = pattern.matcher(input);
            String[] fullName = input.split("\\s");
//            System.out.println(fullName.length);
            if (matcher.find()) {
                if (fullName[0].equals(fullName[1]) || fullName[0].equals(fullName[2])) {
                    System.out.println("Введенная строка не является ФИО");
                } else {
                    System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", fullName[0], fullName[1], fullName[2]);
                }
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        }
    }
}
