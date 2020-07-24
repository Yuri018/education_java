package EmailAddressBook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressBook {

    private static final EmailManager emailManager = new EmailManager();

    public static void main(String[] args) {
        emailManager.addEmailAddress("aaa@skillbox.com");
        emailManager.addEmailAddress("bbb.ccc@skillbox.ru");

        System.out.println("Инструкция:\nкоманда LIST - просмотр списка адресов \n" +
                "команда ADD - добавление нового адреса \n" +
                "_________________________________\nВведите команду");

        scan();
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(list|add)(?:[ \\t]*([A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}\\s*))?$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String userInput = matcher.group(2);//строковая переменная для второй группы захвата
            switch (matcher.group(1)) {
                case "list":
                    emailManager.printTreeSet();
                    break;
                case "add":
                    emailManager.addEmailAddress(userInput);
                    break;
            }
            scanner.close();
        }
    }
}
