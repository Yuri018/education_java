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
      list.set(0, "Zehn");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
