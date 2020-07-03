import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Подъем в 6.00");
        todoList.add("Встреча в офисе в 10.00");
        todoList.add("Передать данные");

        TodoListManager.printArrayList(todoList);
//        TodoList mainClass = new TodoList();
//        mainClass.printArrayList(todoList);
    }

}