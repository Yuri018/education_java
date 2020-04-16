import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isSpaceChar;

public class FullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию, имя и отчество: ");
        String text = scanner.nextLine();

        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++){
            if (isSpaceChar(text.charAt(i))){
                spaceCount++;
            }
            if (isDigit(text.charAt(i))){
                System.out.println("Ввод цифровых значений недопустим!");
                return;
            }
        }
        if (spaceCount != 2){
            System.out.println("Данные введены неверно!");
            return;
        }
        System.out.println("Фамилия: " + text.substring(text.indexOf(""), text.indexOf(" ")) + "\n" +
                "Имя: " + text.substring(text.indexOf(" ") + 1, text.lastIndexOf(" ")) + "\n" +
                "Отчество: " + text.substring(text.lastIndexOf(" ") + 1, text.lastIndexOf("")));
    }
}



