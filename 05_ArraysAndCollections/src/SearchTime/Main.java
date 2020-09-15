package SearchTime;

import java.util.*;

public class Main {

    private static final RequestTime requestTimeSet = new RequestTime();

    public static void main(String[] args) {

        requestTimeSet.init();

        System.out.println("Всего сгенерировано: " + requestTimeSet.getArrayList().size());

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите номер для расчета или EXIT для выхода из программы:");
            String userInput = scanner.nextLine();
            if (userInput.matches("exit")) {
                break;
            }
            requestTimeSet.simpleSearch(requestTimeSet.getArrayList(), userInput);
            requestTimeSet.binarySearch(requestTimeSet.getArrayList(), userInput);
            requestTimeSet.hashSetSearch(requestTimeSet.getHashSet(), userInput);
            requestTimeSet.treeSetSearch(requestTimeSet.getTreeSet(), userInput);
        }
    }
}


