package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTests {
    public static void main(String[] args) {

        int numberAdd;
        int numberEdit;

        final String regex = "(\\s*list\\s*|\\s*add\\s*|\\s*edit\\s*)(\\d+)(\\w+)";
        final String string = "add 45";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {

            numberAdd = Integer.parseInt(matcher.group(2));
            numberEdit = Integer.parseInt(matcher.group(4));

            System.out.println(matcher.group(1));
            System.out.println(numberAdd);
            System.out.println(matcher.group(3));
            System.out.println(numberEdit);

        }
    }
}
