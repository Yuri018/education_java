import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerForTodoList {
    public static void scan(ArrayList<String> todoList) {

        System.out.println("ввод команды LIST, ADD");

            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(^add|list|edit\\b)(?:(?:\\s+)(\\d+))?(?:\\s*(.*))?");
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()){
                String eventNumber = matcher.group(2);
                String userText = matcher.group(3);
                Integer number = null;
                if (eventNumber != null && !eventNumber.isEmpty()){
                    number = Integer.parseInt(eventNumber);
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
