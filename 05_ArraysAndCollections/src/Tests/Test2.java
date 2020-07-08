package Tests;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
        public static void main(String[] args) {
            ArrayList<String> todoList = new ArrayList<>() {{
                add(0, "Почистить зубы");
                add(1, "Сделать зарядку");
                add(2, "Выпить стакан воды");
                add(3, "Приготовить завтрак");
                add(4, "Отправится на работу");//Добавляем пункт по индексу 4
            }};
            Scanner sc = new Scanner(System.in);
            var str = "LIST";
            System.out.print("Чтобы посмотреть содержимое списка введите команду LIST : ");
            if (sc.hasNext()) { // возвращает истину если с потока ввода можно считать слово
                str = sc.next(); // считывает слово с потока ввода и сохраняем в переменную
                System.out.println(str);
            } else {
                System.out.println("Вы ввели не правильную команду");
            }
            for (String item : todoList) {
                System.out.println(item);
            }
            var strAdd = "ADD";
            System.out.print("Чтобы добавить новое дело в список введите команду ADD : ");
            if (sc.hasNext()) { // возвращает истину если с потока ввода можно считать слово
                strAdd = sc.next(); // считывает слово с потока ввода и сохраняем в переменную
                System.out.println(strAdd + '\n' + "Введите дело которое хотите добавить в список : ");
                todoList.add(sc.next());
                System.out.println("Новое дело добавленно в список! \n");
            } else {
                System.out.println("Вы ввели не правильную команду");
            }
        }
}
