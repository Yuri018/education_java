package PhoneBook2;

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("+7 (111) 012-34-56", "Yuri");
        phoneBook.put("+7 (222) 012-34-56", "Michel");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для просмотра списка введите команду \"LIST\"\n" +
                "для добавления нового контакта введите имя или номер\n" +
                "для выхода введите \"EXIT\"");
        for (; ; ) {
            System.out.println("Ввод:");
            String userInput = scanner.nextLine();

            if (userInput.matches("list")) {
                printPhoneBook(phoneBook);
            } else if (userInput.matches("exit")) {
                break;
            } else if (userInput.matches("(\\+[0-9]\\d{10}|\\d{11})")) {
                String i = formatNumber(userInput);
                if (phoneBook.containsKey(i)) {
                    System.out.println("Имя: " + phoneBook.get(i) + " номер: " + i);
                } else {
                    System.out.println("введите имя для нового контакта");
                    String name = scan();

                    if (name.matches("([a-zA-Z\\s]+)")) {
                        String upperCase = firstUpperCase(name);
                        phoneBook.put(i, upperCase);
                        System.out.println("Новый контакт:\n" + "Имя: " + upperCase + " номер: " + i);
                    }
                }
            } else if (userInput.matches("([a-zA-Z\\s]+)")) {
                String upperCase = firstUpperCase(userInput);
                if (phoneBook.containsValue(upperCase)) {
                    for (Map.Entry<String, String> v : phoneBook.entrySet()) {
                        if (v.getValue().equals(upperCase)) {
                            System.out.println("Имя: " + v.getValue() + " номер: " + v.getKey());
                        }
                    }
                } else {
                    System.out.println("Введите номер нового контакта");
                    String key = scan();
                    if (key.matches("(\\+?\\d{11})")) {
                        String i = formatNumber(key);
                        phoneBook.put(i, upperCase);
                        System.out.println("Новый контакт:\n" + "Имя: " + upperCase + " номер: " + i);
                    }
                }
            }
        }
    }

    //метод печати с сортировкой значений в алфавитном порядке
    static void printPhoneBook(Map<String, String> map) {
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.println("Имя: " + x.getValue() +  " номер: " + x.getKey()));
        //стандартный метод печати с сортировкой по ключам
//        for (String book : map.keySet()) {
//            System.out.println(book + " " + map.get(book));
//        }
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //Делаем первую букву заглавной (необходимо для правильной сортировки по значению)
    public static String firstUpperCase(String big) {
        return big.substring(0, 1).toUpperCase() + big.substring(1);
    }

    // Приводим номер к единому формату
    static String formatNumber(String number) {
        return number.replaceAll("(\\+\\d|\\d)?(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                "+7 ($2) $3-$4-$5");
    }
}

