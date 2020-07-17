package ToDoList;

import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Подъем в 6.00");
        todoList.add("Встреча в офисе в 10.00");
        todoList.add("Передать данные");

        System.out.println("Инструкция:\nкоманда LIST - просмотр событий \n" +
                "команда ADD - добавление события \n" +
                "команда EDIT - редактирование события \n" +
                "команда DELETE удаление события");
        ScannerForTodoList.scan(todoList);

    }

}