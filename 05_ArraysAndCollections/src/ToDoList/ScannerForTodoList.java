package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerForTodoList {
    public static void scan(ArrayList<String> todoList) {

            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();

            final Pattern pattern = Pattern.compile
                    ("^(\\s*add|list|edit|delete|exit)(?:[ \\t]*(\\d+))?(?:[ \\t]*(.+))?$");
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()){
                String number = matcher.group(2);
                String userText = matcher.group(3);
                Integer eventNumber = null;
                if (number != null && !number.isEmpty()){
                    eventNumber = Integer.parseInt(number);
                }
                switch (matcher.group(1)){
                    case "add":
                        if (eventNumber != null && userText != null){
                            TodoListManager.addToArrayList(todoList, eventNumber, userText);
                            break;
                        }if (eventNumber == null && userText != null) {
                        TodoListManager.addToArrayList(todoList, userText);
                    } else {
                            System.out.println("плохо");
                            ScannerForTodoList.scan(todoList);
                        }
                        break;

                    case "list":
                        TodoListManager.printArrayList(todoList);
                        break;

                    case "edit":
                        if (eventNumber != null && userText != null){
                            TodoListManager.editArrayList(todoList, eventNumber, userText);
                        }else {
                            System.out.println("Для редактирования события введите" +
                                    " 1. EDIT 2. номер события 3. Новое событие");
                            ScannerForTodoList.scan(todoList);
                        }
                        break;

                    case "delete":
                        if (eventNumber != null && eventNumber <= todoList.size()){
                            TodoListManager.delEvent(todoList, eventNumber);
                        }else {
                            System.out.println("Для удаления события введите" +
                                    " 1. DELETE 2. номер события");
                            ScannerForTodoList.scan(todoList);
                        }
                        break;
                    case "exit":
                        TodoListManager.exitTodoList(todoList);
                        return;
                }
                System.out.println("Чтобы продолжить введите команду");
                ScannerForTodoList.scan(todoList);

            }scanner.close();
    }
}
