package ToDoList;

import java.util.ArrayList;

public class ToDoListManager {

    private final ArrayList<String> toDoList = new ArrayList<>();

    void printArrayList() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + " " + toDoList.get(i));
        }
    }

    void addToArrayList(String todoText) {
        toDoList.add(todoText);
    }

    void addToArrayList(Integer eventNumber, String todoText) {
        if (eventNumber <= toDoList.size()) {
            toDoList.add(eventNumber - 1, todoText);
            printTodoList();
        }
        if (eventNumber > toDoList.size()) {
            toDoList.add(todoText);
            printTodoList();
        }
    }

    void editArrayList(Integer eventNumber, String todoText) {
        if (eventNumber != null && todoText != null) {
            toDoList.set(eventNumber - 1, todoText);
            printTodoList();
        } else {
            System.out.println("Для редактирования события введите" +
                    " 1. EDIT 2. номер события 3. Новое событие");
            ToDoList.scan();
        }
    }

    void delEvent(Integer eventNumber) {
        //проверяем корректность и варианты ввода команды
        if (eventNumber != null && eventNumber <= toDoList.size()) {
            toDoList.remove(eventNumber - 1);
        } else {
            System.out.println("Для удаления события введите" +
                    " 1. DELETE 2. номер события");
            ToDoList.scan();
        }
        printTodoList();
    }

    void exitTodoList() {
        printTodoList();
        System.out.println("До встречи!");
    }

    void printTodoList() {
        System.out.println("Ваш список событий:");
        printArrayList();
    }
}
