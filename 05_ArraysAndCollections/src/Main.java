import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>(){{
          add ("Funf");
          add("Sechs");
      }};
      list.add("Ein");
      list.add("Zwei");
      list.add("Drei");
      list.add("Vier");
////заменим элемент "Funf" т.е. метод set удаляет элемент под индексом 0
//      list.set(0, "Zehn");

//       для вывода списка в обратном порядке
//        for (int i = 0; i < list.size(); i++) {
//            int j = list.size() - i - 1;
//            //размер списка size вместо length и круглые скобки вместо квадратных
//            System.out.println(list.get(j));
//        }
//        Collections.reverse(list);
//        System.out.println(list);
//        for (String x: list
//             ) {
//            System.out.println(x);
//        }
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator.set("acht");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

//        System.out.println((list.get(1)) + ", " + (list.get(3)));
    }
}
