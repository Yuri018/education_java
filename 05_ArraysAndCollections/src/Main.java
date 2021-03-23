import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Ein");
      list.add("Zwei");
      list.add("Drei");
      list.add("Vier");
        System.out.println(list.size());
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
