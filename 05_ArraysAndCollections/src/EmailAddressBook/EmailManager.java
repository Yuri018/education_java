package EmailAddressBook;

import java.util.TreeSet;

public class EmailManager {

    private final TreeSet<String> eMailBook = new TreeSet<>();

    void printTreeSet() {
        for (String list : eMailBook) {
            System.out.println(list);
        }
    }

    void addEmailAddress(String address) {
        if (address != null) {
            eMailBook.add(address);
            printTreeSet();
        } else {
            System.out.println("Введите правильный адрес");
            EmailAddressBook.scan();
        }
    }
}
