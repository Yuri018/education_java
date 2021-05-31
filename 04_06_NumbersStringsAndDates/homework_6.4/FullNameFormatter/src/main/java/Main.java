import java.util.Scanner;
import static java.lang.Character.isDigit;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int spaceCount = 0;
            boolean hasDigit = false;
            input = input.trim();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' '){
                    spaceCount++;
                }
                if (isDigit(input.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (spaceCount != 2 || hasDigit) {
                System.out.println("Введенная строка не является ФИО");
                return;
            } else {
                String surname = input.substring(0, input.indexOf(" "));
                String withoutSurname = input.substring(input.indexOf(" ") + 1);
                String name = withoutSurname.substring(0, withoutSurname.indexOf(" "));
                String fatherName = withoutSurname.substring(withoutSurname.indexOf(" ") + 1);
                System.out.println("Фамилия: " + surname);
                System.out.println("Имя: " + name);
                System.out.println("Отчество: " + fatherName);
            }
        }
    }
}