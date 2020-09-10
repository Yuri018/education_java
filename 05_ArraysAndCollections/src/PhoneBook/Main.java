package PhoneBook;

import java.util.Map;

public class Main {
    private static final PhoneBook phoneBookControl = new PhoneBook();

    public static void main(String[] args) {

        phoneBookControl.addPhoneBook("+7 (111) 012-34-56", "yuri");
        phoneBookControl.addPhoneBook("+72220123456", "Michel");
        String name;
        String phone;

        System.out.println("To view the list, enter \"LIST\"\n" +
                "To add a new contact enter a name or number\n" +
                "To exit enter \"EXIT\"");
        for (; ; ) {
            System.out.println("Input:");
            String userInput = PhoneBook.scan();

            if (userInput.matches("list")) {
                phoneBookControl.printPhoneBook();
            } else if (userInput.matches("exit")) {
                break;
            } else if (userInput.matches("(\\+[0-9]\\d{10}|\\d{11})")) {

                if (phoneBookControl.searchKey(userInput)) {
                    phoneBookControl.printContactInfo(userInput);
                } else {
                    System.out.println("Enter a name for the new contact");
                    name = PhoneBook.scan();

                    if (name.matches("([a-zA-Z\\s]+)")) {
                        System.out.println("New contact: ");
                        phoneBookControl.addPhoneBook(userInput, name);
                    }
                }
            } else if (userInput.matches("([a-zA-Z\\s]+)")) {
//                name = userInput;
                if (phoneBookControl.searchValue(userInput)) {
                    for (Map.Entry<String, String> v : phoneBookControl.entrySet()) {
                        if (v.getValue().equals(userInput)) {
                            System.out.println("Name: " + v.getValue() + " phone number: " + v.getKey());
                        }
                    }
                } else {
                    System.out.println("Enter the number of the new contact");
                    phone = PhoneBook.scan();
                    if (phone.matches("(\\+[0-9]\\d{10}|\\d{11})")) {
                        System.out.println("New contact: ");
                        phoneBookControl.addPhoneBook(phone, userInput);
                    }
                }
            }
        }
    }
}