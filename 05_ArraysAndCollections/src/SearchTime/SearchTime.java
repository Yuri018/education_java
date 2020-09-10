package SearchTime;

import java.util.*;

public class SearchTime {
    public static void main(String[] args) {

//        String[] letters = {"А", "В", "С", "Е", "Н", "К", "М", "О", "Р", "Т", "У", "Х"};
        String[] letters = {"А", "В", "С", "Е"};

        List<String> arrayList = new ArrayList<>();
//        Set<String> hashSet = new HashSet<>(arrayList);
        //        Set<String> treeSet = new TreeSet<>();


        for (int num = 111; num <= 999; num += 111) {
            for (String letter : letters) {
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int region = 1; region <= 197; region++) {
                            String number = String.format("%s%d%s%02d", letter, num, letter2 + letter3, region);
                            arrayList.add(number);
//
//                            treeSet.addAll(arrayList);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        Set<String> hashSet = new HashSet<>(arrayList);
        Set<String> treeSet = new TreeSet<>(arrayList);
        System.out.println(arrayList);

        System.out.println("Всего сгенерировано: " + arrayList.size());


        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите номер для поиска:");
            String userInput = scanner.nextLine();
            simpleSearch(arrayList, userInput);
            binarySearch(arrayList, userInput);
            hashSetSearch(hashSet, userInput);
            treeSetSearch(treeSet, userInput);
        }
    }

    static void simpleSearch(List<String> arraylist, String userInput) {
        long start = System.nanoTime();
        if (arraylist.contains(userInput)) {
            System.out.println("Поиск перебором: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Поиск перебором: номер " + userInput + " не найден");
        }
    }

    static void binarySearch(List<String> arraylist, String userInput) {
//        Collections.sort(arraylist);
        long start = System.nanoTime();
        int index = Collections.binarySearch(arraylist, userInput);
        System.out.println("Index =" + index);
        if (index > 0) {
            System.out.println("Бинарный поиск: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Бинарный поиск: номер " + userInput + " не найден");
        }

    }

    static void hashSetSearch(Set<String> hashSet, String userInput) {
        long start = System.nanoTime();
        if (hashSet.contains(userInput)) {
            System.out.println("Поиск hashSet: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Поиск hashSet: номер " + userInput + " не найден");
        }
    }

    static void treeSetSearch(Set<String> hashSet, String userInput) {
        long start = System.nanoTime();
        if (hashSet.contains(userInput)) {
            System.out.println("Поиск TreeSet: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Поиск TreeSet: номер " + userInput + " не найден");
        }
    }
}


