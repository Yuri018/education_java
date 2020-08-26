package PhoneBook;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    private static final PhoneBookControl phoneBookControl = new PhoneBookControl();

    public static void main(String[] args) {

        phoneBookControl.addEntryPhoneBook("+79876543210", "Yuri");
        phoneBookControl.addEntryPhoneBook("+79876543211", "Maks");

        scan();

    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(add|list|edit)?(?:[ \\t]*(\\+?\\d{11}))?(?:[ \\t]*(.+))?$");
        Matcher matcher = pattern.matcher(userInput);

        while (true) {
            String command = matcher.group(1);
            String keyNumber = matcher.group(2);
            String valueName = matcher.group(3);
            if (userInput.equals(command)) {
                phoneBookControl.printPhoneBook();
                continue;
            } else if (phoneBookControl.phoneMap.containsValue(valueName)) {
                for (Map.Entry<String, String> value : phoneBookControl.phoneMap.entrySet()) {
                    if (value.getValue().equals(valueName)) {
                        System.out.println(value.getKey() + " " + value.getValue());
                    }
                }
            } else {
                System.out.println("Введите номер для этого контакта ");
                String number = userInput;
                phoneBookControl.phoneMap.put(number, valueName);
                phoneBookControl.printPhoneBook();
            }

            if (phoneBookControl.phoneMap.containsKey(keyNumber)) {
                System.out.println(keyNumber + " " + phoneBookControl.phoneMap.get(keyNumber));//метод get по ключу выводит значение
            }

        }
    }
}

//регулярка правильная
//