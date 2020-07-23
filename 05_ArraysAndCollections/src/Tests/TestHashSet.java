package Tests;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>(){{
            add("eins");
           add("zwei");
           add("drei");
           add("drei");
        }};
        list.add("1");
        System.out.println(list);
    }
}
