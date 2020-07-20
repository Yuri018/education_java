package ToDoList;

import java.util.ArrayList;

public class ToDoListManager {

    private final ArrayList<String> toDoList = new ArrayList<>();

    public ArrayList<String> getToDoList() {
        return toDoList;
    }

    void printArrayList(ArrayList<String> toDoList) {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println((i + 1) + " " + toDoList.get(i));
        }
    }

    void addToArrayList(String todoText) {
        toDoList.add(todoText);
    }

    void addToArrayList(ArrayList<String> toDoList, Integer eventNumber, String todoText) {
        if (eventNumber <= toDoList.size()) {
            this.toDoList.add(eventNumber - 1, todoText);
            printTodoList(toDoList);
        }
        if (eventNumber > toDoList.size()) {
            this.toDoList.add(todoText);
            printTodoList(toDoList);
        }
    }

    void editArrayList(ArrayList<String> toDoList, Integer eventNumber, String todoText) {
        toDoList.set(eventNumber - 1, todoText);
        printTodoList(toDoList);
    }

    void delEvent(ArrayList<String> toDoList, Integer eventNumber) {
        //проверяем корректность и варианты ввода команды
        if (eventNumber != null && eventNumber <= toDoList.size()) {
            toDoList.remove(eventNumber - 1);
        } else {
            System.out.println("Для удаления события введите" +
                    " 1. DELETE 2. номер события");
            ToDoList.scan(toDoList);
        }
        printTodoList(toDoList);
    }

    void exitTodoList(ArrayList<String> toDoList) {
        printTodoList(toDoList);
        System.out.println("До встречи!");
    }

    void printTodoList(ArrayList<String> toDoList) {
        System.out.println("Ваш список событий:");
        printArrayList(toDoList);
    }
}
