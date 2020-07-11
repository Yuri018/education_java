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

            final Pattern pattern = Pattern.compile("(\\s*list\\s*|\\s*add\\s*|\\s*edit\\s*)(\\d+)(\\w+)");
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()){
                String param1 = matcher.group(2);
                String userText = matcher.group(3);
                Integer number = null;
                if (param1 != null && !param1.isEmpty()){
                    number = Integer.parseInt(param1);
                }
                switch (matcher.group(1)){
                    case "add":
                        if (number != null){
                            TodoListManager.addToArrayList(todoList, number, userText);
                        }
                        else {
                            TodoListManager.addToArrayList(todoList, userText);
                        }
                        break;

                    case "list":
                        TodoListManager.printArrayList(todoList);
                        break;
                    default:
                        System.out.println("неверная команда");
                        ScannerForTodoList.scan(todoList);
                        break;
                }
                scanner.close();
            }

    }
}
