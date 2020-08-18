package PhoneBook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBookControl {

    Map<String, String> phoneMap = new TreeMap<>();

    public void printPhoneBook() {
//        System.out.println("Номер телефона:");
//        for (String key : phoneMap.keySet()) {//первый вариант
//            System.out.println(key + " ФИО: " + phoneMap.get(key));
//        }
        for (Map.Entry<String, String> entry : phoneMap.entrySet()) {//второй свариант
            System.out.println("ФИО: " + entry.getValue()
                    + " телефон: " + entry.getKey());
        }
    }

    public void addEntryPhoneBook(String number, String name) {
        phoneMap.put(number, name);
    }


}
