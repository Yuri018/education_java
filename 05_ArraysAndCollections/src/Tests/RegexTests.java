package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTests {
    public static void main(String[] args) {

        int numberAdd;
        int numberEdit;

        // regex (add\s*[\d?]*)|(edit\s*[\d?]*) мой
        //(^add|list|edit\b)(?:(?:\s+)(\d+))?(?:\s*(.*))?
        //^(add|list|edit)(?:[ \t]+(\d+))?(?:[ \t]+(.+))?$ с обязательными пробелами
        //^(add|list|edit)(?:[ \t]*(\d+))?(?:[ \t]*(.+))? без пробелов


        final String regex = "(^add|list|edit\\b)(?:(?:\\s+)(\\d+))?(?:\\s*(.*))?";
        final String string = "list";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {

            System.out.println(matcher.groupCount());

            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));

        }
    }
}
