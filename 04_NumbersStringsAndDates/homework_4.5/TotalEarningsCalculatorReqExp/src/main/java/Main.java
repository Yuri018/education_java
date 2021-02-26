import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Вася 580заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей 437 ";
        calculateSalarySum(text);

    }

    public static int calculateSalarySum(String text) {

        List<Integer> listCount = new ArrayList<>();
        int count;
        int result = 0;

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count = Integer.parseInt(matcher.group());
            listCount.add(count);
            System.out.println(listCount.size());
        }
        for (int i : listCount) {
            result += i;
        }
        System.out.println(result);
        return result;
    }

}