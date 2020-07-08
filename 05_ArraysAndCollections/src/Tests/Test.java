package Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("Список команд: LIST открывает список, ADD добавляет что-то в список, DELETE удаляет что-то из списка");
        System.out.println("Вызовите команду : ");
        ArrayList<String> todoList = new ArrayList<>() {{
            add(0, "Почистить зубы");
            add(1, "Сделать зарядку");
            add(2, "Выпить стакан воды");
            add(3, "Приготовить завтрак");
            add(4, "Отправиться на работу");
        }};

        Iterator<String> iterator = todoList.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
        System.out.println("_____________________");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
        System.out.println("_____________________");

        System.out.println(todoList);


//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            switch (sc.nextLine()) {
//                case "LIST":
//                    System.out.println("Ваш список дел: " + todoList);
//                    continue;
//
//                case "ADD":
//                    System.out.println("Добавить дело в список: ");
//                    todoList.add(sc.nextLine());
//                    System.out.println("Дело добавленно!" + " номер в списке: " + todoList.size());
//                    continue;
//
//                case "DELETE":
//                    System.out.println("Удалить дело из списка: ");
//                    todoList.remove(sc.nextInt() - 1);
//                    System.out.println("Дело удалено! " + todoList.size());
//                    continue;
//
//                default:
//                    System.out.println("Давайте выберем действие!");
//                    break;
//            }
//            sc.close();
//        }

    }
}
