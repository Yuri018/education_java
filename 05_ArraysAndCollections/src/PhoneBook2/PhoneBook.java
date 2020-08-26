package PhoneBook2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("+71110123456", "Yuri");
        phoneBook.put("+72220123456", "Michel");

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            String userInput = scanner.nextLine();
            if (userInput.matches("list")) {
                printPhoneBook(phoneBook);
            } else if (userInput.matches("[ \\t]*(\\+?\\d{11})")) {
                if (phoneBook.containsKey(userInput)) {
                    System.out.println("ключ - " + userInput + " значение - " + phoneBook.get(userInput));
                } else {
                    System.out.println("введите имя для нового контакта");
                    String name = scan();
                    if (name.matches("[a-zA-Z]*")) {
                        phoneBook.put(userInput, name);
                        System.out.println("ключ - " + userInput + " значение - " + name);
                    }
                }
            } else if (userInput.matches("[a-zA-Z]*")) {
                if (phoneBook.containsValue(userInput)) {
                    for (Map.Entry<String, String> v : phoneBook.entrySet()) {
                        if (v.getValue().equals(userInput)) {
                            System.out.println("ключ - " + v.getKey() + " значение -  " + v.getValue());
                        }
                    }
                } else {
                    System.out.println("Введите номер нового контакта");
                    String key = scan();
                    if (key.matches("[ \\t]*(\\+?\\d{11})")) {
                        phoneBook.put(key, userInput);
                    }
                }
            }
        }
    }

    //метод вывода на печать
    static void printPhoneBook(Map<String, String> map) {
        for (String book : map.keySet()) {
            System.out.println(book + " " + map.get(book));
        }
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
