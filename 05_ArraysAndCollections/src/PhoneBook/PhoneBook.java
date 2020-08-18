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

//        phoneBookControl.printPhoneBook();//вывод на печать
        scan();

    }

    private static void scan() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\.*");
        Matcher matcher = pattern.matcher(userInput);
//        while (matcher.find()) {
            if (userInput.equals("list")) {
                phoneBookControl.printPhoneBook();
            }
            if (phoneBookControl.phoneMap.containsKey(userInput)) {
                for (Map.Entry<String, String> key : phoneBookControl.phoneMap.entrySet()) {
                    if (key.getKey().contains(userInput)) {
                        System.out.println(key.getKey() + " " + key.getValue());
                    }
                }
            } else if (phoneBookControl.phoneMap.containsValue(userInput)) {
                for (Map.Entry<String, String> value : phoneBookControl.phoneMap.entrySet()) {
                    if (value.getValue().contains(userInput)) {
                        System.out.println(value.getKey() + " " + value.getValue());
                    }
                }
            }
        }
//    }
}

//is Empty - пусто