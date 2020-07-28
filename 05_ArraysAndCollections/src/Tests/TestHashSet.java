package Tests;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<>(){{
            add("eins");
           add("zwei");
           add("drei");
           add("drei");
        }};
        list.add("1");
        System.out.println(list);
        for (String set: list
             ) {
            System.out.println(set);
        }
    }
    void test (){

    }
}
