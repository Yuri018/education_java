import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>(){{
          add ("Funf");
          add("Sechs");
      }};
      list.add("Ein");
      list.add("Zwei");
      list.add("Drei");
      list.add(3, "Vier");
//заменим элемент "Funf" т.е. метод set удаляет элемент под индексом 0
      list.set(0, "Zehn");
//        for (int i = 0; i < list.size(); i++) {
//            //размер списка size вместо length и круглые скобки вместо квадратных
//            System.out.println(list.get(i));
//        }
        System.out.println((list.get(1)) + ", " + (list.get(3)));
    }
}
