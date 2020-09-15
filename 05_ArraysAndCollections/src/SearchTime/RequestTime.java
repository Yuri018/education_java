package SearchTime;

import java.util.*;

public class RequestTime {
    private final String[] letters = {"A", "B", "C", "E", "H", "K", "M", "O", "P", "T", "Y", "X"};
    private final List<String> arrayList = new ArrayList<>();
    private final Set<String> hashSet = new HashSet<>();
    private final Set<String> treeSet = new TreeSet<>();

    public List<String> getArrayList() {
        return arrayList;
    }

    public Set<String> getHashSet() {
        return hashSet;
    }

    public Set<String> getTreeSet() {
        return treeSet;
    }

    public void init() {
        for (int num = 111; num <= 999; num += 111) {
            for (String letter : letters) {
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int region = 1; region <= 197; region++) {
                            String number = String.format("%s%d%s%02d", letter, num, letter2 + letter3, region);
                            arrayList.add(number);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        hashSet.addAll(arrayList);
        treeSet.addAll(arrayList);
    }

    public void simpleSearch(List<String> arraylist, String userInput) {
        long start = System.nanoTime();
        if (arraylist.contains(userInput)) {
            System.out.println("Поиск перебором: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Поиск перебором: номер " + userInput + " не найден");
        }
    }

    public void binarySearch(List<String> arraylist, String userInput) {
        long start = System.nanoTime();
        int index = Collections.binarySearch(arraylist, userInput);
        if (index >= 0) {
            System.out.println("Бинарный поиск: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Бинарный поиск: номер " + userInput + " не найден");
        }

    }

    public void hashSetSearch(Set<String> hashSet, String userInput) {
        long start = System.nanoTime();
        if (hashSet.contains(userInput)) {
            System.out.println("Поиск hashSet: номер " + userInput + " найден");
            long duration = System.nanoTime() - start;
            System.out.println("поиск занял " + duration + " nc");
        } else {
            System.out.println("Поиск hashSet: номер " + userInput + " не найден");
        }
    }

    public void treeSetSearch(Set<String> hashSet, String userInput) {
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
