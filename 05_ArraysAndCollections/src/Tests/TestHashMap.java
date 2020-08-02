package Tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> goods2count = new HashMap<>();
        /*если необходимо упорядочить список, используем TreeMap,
        где сортировка списка будет происходить по алфавиту */
        Scanner scanner = new Scanner(System.in);
        for ( ; ; ){
            String goodsName = scanner.nextLine();
            if (goodsName.equals("печать")){
                printMap(goods2count);
                continue;
            }
            if (goods2count.containsKey(goodsName)){
                //метод добавления в коллекцию put с параметрами 
                goods2count.put(goodsName, goods2count.get(goodsName) + 1);
            } else {
                goods2count.put(goodsName, 1);
            }
        }
    }
    //создаем метод для печати
    private static void printMap (Map<String, Integer> map){
        for (String key : map.keySet()){
            System.out.println(key + " => " + map.get(key));
        }
    }
}

