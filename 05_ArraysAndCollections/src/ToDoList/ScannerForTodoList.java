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
                    ("^(add|list|edit|delete|exit)(?:[ \\t]+(\\d+))?(?:[ \\t]+(.+))?$");
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
                        if (eventNumber != null){
                            TodoListManager.addToArrayList(todoList, eventNumber, userText);
                        }
                        else {
                            TodoListManager.addToArrayList(todoList, userText);
                        }
                        break;

                    case "list":
                        TodoListManager.printArrayList(todoList);
                        break;

                    case "edit":
                        if (eventNumber != null){
                            TodoListManager.editArrayList(todoList, eventNumber, userText);
                        }else {
                            System.out.println("Введите номер и новое событие");
                            ScannerForTodoList.scan(todoList);
                        }
                        break;
                    case "delete":
                        if (eventNumber != null && eventNumber <= todoList.size()){
                            TodoListManager.delEvent(todoList, eventNumber);
                        }else {
                            System.out.println("Нужен номер события для удаления");
                            ScannerForTodoList.scan(todoList);
                        }
                        break;
                    case "exit":
                        TodoListManager.exitTodoList(todoList);
                        break;
                }scanner.close();

            }
    }
}
