package SearchTime;

import java.util.*;

public class Main {

    private static final RequestTime requestTimeSet = new RequestTime();

    public static void main(String[] args) {

        requestTimeSet.numGenerator();

//        System.out.println(requestTimeSet.arrayList);
        System.out.println("Всего сгенерировано: " + requestTimeSet.arrayList.size());

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите номер для поиска:");
            String userInput = scanner.nextLine();
            if (userInput.matches("exit")) {
                break;
            }
            requestTimeSet.simpleSearch(requestTimeSet.arrayList, userInput);
            requestTimeSet.binarySearch(requestTimeSet.arrayList, userInput);
            requestTimeSet.hashSetSearch(requestTimeSet.hashSet, userInput);
            requestTimeSet.treeSetSearch(requestTimeSet.treeSet, userInput);
        }
    }
}


