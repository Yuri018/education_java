import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullNameRegex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество: ");
        final String text = scanner.nextLine();

        final String regex = "([а-яА-ЯёЁ[-]?]+)\\s*([а-яА-ЯёЁ]+)\\s*([а-яА-ЯёЁ]+)";
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
//            System.out.println(matcher.groupCount());// проверка количества групп
            System.out.println("Фамилия: " + matcher.group(1));
            System.out.println("Имя: " + matcher.group(2));
            System.out.println("Отчество: " + matcher.group(3));
        }else
            System.out.println("Данные введены неверно");
    }
}
