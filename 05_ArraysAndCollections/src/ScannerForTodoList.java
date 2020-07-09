import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerForTodoList {
    public static void scan(ArrayList<String> todoList) {

        System.out.println("ввод команды LIST, ADD");

            Scanner scanner = new Scanner(System.in);
       // regex (add\s*[\d?]*)|(edit\s*[\d?]*)
            String string = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(\\s*list\\s*)|(\\s*add\\s*)");
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()){
                switch (matcher.group()){
                    case "add":
                        TodoListManager.addToArrayList(todoList);
                        continue;
                    case "list":
                        TodoListManager.printArrayList(todoList);
                        continue;
                    default:
                        ScannerForTodoList.scan(todoList);
                        break;
                }
                scanner.close();
            }

    }
}
