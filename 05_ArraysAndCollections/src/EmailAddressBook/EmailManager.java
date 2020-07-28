package EmailAddressBook;

import java.util.TreeSet;

public class EmailManager {

    private final TreeSet<String> eMailBook = new TreeSet<>();

    void printTreeSet() {//метод печати списка адресов
        for (String list : eMailBook) {
            System.out.println(list);
        }
    }

    void addEmailAddress(String address) {// метод добавления адреса
        if (address != null) {//проверяем корректность и введение адреса
            if (eMailBook.contains(address)) {//проверяем на наличие
                // введенного адреса в коллекции
                System.out.println("Такой адрес уже существует");
                notice();
            }
            eMailBook.add(address);//добавление адреса в коллекцию
        } else {
            System.out.println("Адрес не введен или введен некорректно!!!");
            notice();
        }
    }

    void notice() {// метод вывода инструкции для пользователя
        System.out.println("Команда LIST - просмотр списка адресов \n" +
                "Команда ADD + Адрес электронной почты - добавление нового адреса \n" +
                "команда EXIT - выход из программы \n_________________________________\n" +
                "Введите команду");
        EmailAddressBook.scan();
    }

    void exitAddressBook() {// метод выхода из программы
        System.out.println("До встречи!");
    }
}
