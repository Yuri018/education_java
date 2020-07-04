import java.util.ArrayList;
import java.util.Scanner;

public class ScannerForTodoList {
    public static void scan(ArrayList<String> todoList) {


        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ввод LIST, ADD");

            switch (scanner.nextLine()){
                case "LIST":
                    TodoListManager.printArrayList(todoList);
                    continue;

                case "ADD":
                    TodoListManager.addToArrayList(todoList);
                    continue;

                    default:
                    System.out.println("exit");
                    break;
            }
            scanner.close();
            break;
        }

    }
}
