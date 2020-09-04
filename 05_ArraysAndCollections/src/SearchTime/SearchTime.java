package SearchTime;

import java.util.*;

public class SearchTime {
    public static void main(String[] args) {

        String[] letters = {"А", "В", "С", "Е", "Н", "К", "М", "О", "Р", "Т", "У", "Х"};

        List<String> list = new ArrayList<>();


        for (int num = 111; num <= 999; num += 111) {
            for (int region = 1; region <= 199; region++) {
                for (String letter : letters) {
                    for (String letter2 : letters) {
                        for (String letter3 : letters) {
                            String number = String.format("%s %03d %s %02d", letter, num,
                                    letter2 + letter3, region);
                            System.out.println(number);
                            list.add(number);

                        }
                    }
                }
            }
        }

        for (String x : list) {
            System.out.println(x);

        }
        System.out.println(list.size());
    }
}


