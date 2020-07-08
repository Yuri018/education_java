package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTests {
    public static void main(String[] args) {
        final String regex = "(\\s*add\\s*)([\\d?]*)(\\s*edit\\s*)([\\d?]*)";
        final String string = "add 45 edit 4";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {

            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));

        }
    }
}
