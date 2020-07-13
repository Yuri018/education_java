import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {

    public static void printArrayList(ArrayList<String> todoList){
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + " " + todoList.get(i));
        }
    }

    public static void addToArrayList(ArrayList<String> todoList, String todoText){
        todoList.add(todoText);
    }
    public static void addToArrayList(ArrayList<String> todoList, Integer number, String todoText){
        if (number <= todoList.size()){
            todoList.add(number - 1, todoText);
        }if (number > todoList.size()){
            todoList.add(todoText);
        }
    }
}
