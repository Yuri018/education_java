import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountProfitRegex {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int[] intArray = new int[3];
        int count = 0;
        int result = 0;

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            intArray[count] = Integer.parseInt(matcher.group());
            count++;
        }
        for (int i: intArray){
            result += i;
        }
        System.out.println("Вася заработал - " + intArray[0] + " руб.");
        System.out.println("Петя заработал - " + intArray[1] + " руб.");
        System.out.println("Маша заработала - " + intArray[2] + " руб.");
        System.out.println("Сумма заработка Васи, Пети и Маши = " + result + " руб.");

//        String a = "[^\\d]+";
//        String[] str = text.split(a);
//
//        int countVasya = Integer.parseInt(str[1]);
//        int countPetya = Integer.parseInt(str[2]);
//        long countMasha = Long.parseLong(str[3]);
//        long sum = countVasya + countPetya + countMasha;
//
//        System.out.println("Вася заработал - " + countVasya + " руб.");
//        System.out.println("Петя заработал - " + countPetya + " руб.");
//        System.out.println("Маша заработала - " + countMasha + " руб.");
//
//        System.out.println("Сумма заработка Васи, Пети и Маши = " + sum + " руб.");
    }
}
