import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerForTodoList {
    public static void scan(ArrayList<String> todoList) {

        System.out.println("ввод LIST, ADD");

            Scanner scanner = new Scanner(System.in);
       // regex (add\s*[\d?]*)|(edit\s*[\d?]*)
            String string = scanner.nextLine();

            final Pattern pattern = Pattern.compile("(\\s*add\\s*)([\\d?]*)(\\s*edit\\s*)([\\d?]*)");
            final Matcher matcher = pattern.matcher(string);

            while (matcher.find()){
                TodoListManager.printArrayList(todoList);
            }

    }
}
