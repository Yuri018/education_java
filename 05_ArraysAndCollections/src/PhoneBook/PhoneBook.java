package PhoneBook;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {
    TreeMap<String, String> phoneBook = new TreeMap<>();

    Set<Map.Entry<String, String>> entrySet() {
        return phoneBook.entrySet();
    }

    boolean searchKey(String phone) {
        return phoneBook.containsKey(formatNumber(phone));
    }

    public void printContactInfo(String phone) {
        String formatNum = formatNumber(phone);
        System.out.println("Name: " + phoneBook.get(formatNum) + " phone number: " + formatNum);
    }

    public boolean searchValue(String name) {
        return phoneBook.containsValue(firstUpperCase(name));
    }

    public void addPhoneBook(String phone, String name) {
        phone = formatNumber(phone);
        name = firstUpperCase(name);
        phoneBook.put(phone, name);
        System.out.println("Name: " + name + " phone number: " + phone);
    }

    //method of printing with values sorted alphabetically
    public void printPhoneBook() {
        phoneBook.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.println("Name: " + x.getValue() + " phone number: " + x.getKey()));
        //standard printing method sorted by keys
//        for (String book : map.keySet()) {
//            System.out.println(book + " " + map.get(book));
//        }
    }

    // method of converting a phone number to a single format
    public static String formatNumber(String number) {
        return number.replaceAll("(\\+\\d|\\d)?(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                "+7 ($2) $3-$4-$5");
    }

    //method of converting first letter to uppercase
    public static String firstUpperCase(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    //printing method
    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}