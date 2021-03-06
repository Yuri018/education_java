package ToDoList;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToDoList {

    //создаем экземпляр класса ToDoListManager
    private static final ToDoListManager tdlManager = new ToDoListManager();

    public static void main(String[] args) {
        tdlManager.addToArrayList("Подъем в 6.00");
        tdlManager.addToArrayList("Встреча в офисе в 10.00");
        tdlManager.addToArrayList("Изучить Java на Skillbox");

        System.out.println("Инструкция:\nкоманда LIST - просмотр событий \n" +
                "команда ADD - добавление события \nкоманда EDIT - редактирование события \n" +
                "команда DELETE - удаление события \nкоманда EXIT - выход из программы \n" +
                "_________________________________\nВведите команду");

        scan();// обращение к методу scan
    }

    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        final Pattern pattern = Pattern.compile
                ("^(list|add|edit|delete|exit)(?:[ \\t]*(\\d+))?(?:[ \\t]*(.+))?$");
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            String number = matcher.group(2);//строковая переменная для второй группы захвата
            String userText = matcher.group(3);//строковая переменная для третьей группы захвата
            Integer eventNumber = null;//класс обертка для номера события
            if (number != null && !number.isEmpty()) {
                eventNumber = Integer.parseInt(number);//переводим в int
            }

            switch (matcher.group(1)) {
                case "list"://вызов метода печати списка событий
                    tdlManager.printArrayList();
                    break;
                case "add"://проверяем корректность и варианты ввода команды
                    if (eventNumber != null && userText != null) {
                        tdlManager.addToArrayList(eventNumber, userText);
                        break;
                    }
                    if (eventNumber == null && userText != null) {
                        tdlManager.addToArrayList(userText);
                    } else {
                        System.out.println("Для добавления события введите" +
                                " 1. ADD 2. номер события (если необходимо) 3. Новое событие");
                        scan();
                    }
                    break;
                case "edit"://проверяем корректность и варианты ввода команды
                    tdlManager.editArrayList(eventNumber, userText);
                    break;
                case "delete":// вызываем метод удаления события
                    tdlManager.delEvent(eventNumber);
                    break;
                case "exit":// вызываем метод выхода из программы
                    tdlManager.exitTodoList();
                    return;
            }
            System.out.println("Чтобы продолжить введите команду");
            scan();

        }
        scanner.close();
    }
}
