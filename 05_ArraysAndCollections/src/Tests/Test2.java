package Tests;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test2 {
        public static void main(String[] args) {
            Map<Integer, String> HashMap = new HashMap<>();
            Map<Integer, String> LinkedMashMap = new LinkedHashMap<>();
            Map<Integer, String> TreeMap = new TreeMap<>();


            testMap(HashMap);
            System.out.println("_____________");
            testMap(LinkedMashMap);
            System.out.println("_____________");
            testMap(TreeMap);

//            HashMap.put( 1, "один");
//            HashMap.put( 2, "два");
//            HashMap.put( 3, "три");

            //варианты вывода на печать ключей и значений
            //первый вариант
//            for (Integer key: map.keySet()){
//                System.out.println(key + " => " + map.get(key));
//            }
//            //второй вариант
//            for (Map.Entry<Integer, String> entry: map.entrySet()){
//                System.out.println(entry.getKey() + "=> " + entry.getValue());
//            }

        }
        public static void testMap(Map<Integer, String> map){
            map.put(39, "Mike");
            map.put(45, "Pol");
            map.put(78, "Red");
            map.put(84, "Sergey");
            map.put(0, "Mike");

            for (Integer key : map.keySet()){
                System.out.println(key + " => " + map.get(key));
            }

        }
}
