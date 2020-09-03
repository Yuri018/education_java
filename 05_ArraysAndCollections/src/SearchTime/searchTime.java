package SearchTime;

import java.lang.reflect.Array;
import java.util.*;

public class searchTime {
    public static void main(String[] args) {
//        String chars[] = new String[]{"А", "В"};
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < 10; j++) {
//                String currChar = chars[i];
//                String number = String.format("(%s)(%d%d%d)%s%s(%d%d)", currChar,  j, j, j, currChar ,currChar, j, j);
//                System.out.println(number);
//            }
//        }
        String  region = "01";
        String[] bukvy = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        Arrays.sort(bukvy);
        String result;
//        for (int i = 0; i < bukvy.length; i++) {
            //первые 2 нуля
//            for (int j = 1; j <= 10; j++) {
//                System.out.printf("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
//            }

//            for (int j = 111; j <= 999; j += 111) {
//                System.out.printf("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
//        }
        for (int i = 111; i <= 999; i += 111) {
            for (int j = 0; j < bukvy.length; j++) {
                for (int j2 = 0; j2 < bukvy.length; j2++) {
                    for (int k = 0; k < bukvy.length; k++) {
//                        System.out.printf("%s%03d%s%02d\n", bukvy[j], i, bukvy[j2] + bukvy[k], region);
                        result = bukvy[j] + i + bukvy[j2] + bukvy[k] + region;
                        System.out.println(result);

                    }
                }
            }
        }
        List<String> arrayList = new ArrayList<>();
    }

}

