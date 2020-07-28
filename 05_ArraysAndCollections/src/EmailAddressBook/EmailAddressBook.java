package EmailAddressBook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressBook {

    //создание экземпляра класса EmailManager
    private static final EmailManager emailManager = new EmailManager();

    public static void main(String[] args) {
        emailManager.addEmailAddress("aaa@skillbox.com");
        emailManager.addEmailAddress("bbb.ccc@skillbox.ru");

        emailManager.notice();
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern pattern = Pattern.compile
                ("^(list|add|exit)\\s*([A-Z0-9._%+-]*@[A-Z0-9.-]+\\.[A-Z]{2,6}\\s*)?$",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String userInput = matcher.group(2);//строковая переменная для второй группы захвата
            switch (matcher.group(1)) {
                case ("list"): // вызываем метод печати списка адресов
                    emailManager.printTreeSet();
                    emailManager.notice();
                    break;
                case "add": // вызываем метод записии адреса в коллекцию
                    emailManager.addEmailAddress(userInput);
                    emailManager.notice();
                    break;
                case "exit":// вызываем метод выхода из программы
                    emailManager.exitAddressBook();
                    break;
            }
        }
        scanner.close();
    }
}
