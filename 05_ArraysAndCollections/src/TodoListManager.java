import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {

    public static void printArrayList(ArrayList<String> todoList){
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + " " + todoList.get(i));
        }
    }

    public static void addToArrayList(ArrayList<String> todoList){
        System.out.println("ввод дела");
        Scanner scanner = new Scanner(System.in);
        todoList.add(scanner.nextLine());
    }

}
