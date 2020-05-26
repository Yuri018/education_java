public class RainbowColors {
    public static void main(String[] args) {
        String[] rainbowColors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        for (int i = 0; i < rainbowColors.length; i++) {
            System.out.println(rainbowColors[i]);
        }
        System.out.println("--------------------------");

        //второй вариант перебора массива, если не нужен индекс элемента
        for (String x: rainbowColors) {
            System.out.println(x);
        }
        System.out.println("--------------------------");
        // цикл для перебора элементов массива в обратном порядке
        for (int i = rainbowColors.length - 1; i >= 0 ; i--) {
            System.out.println(rainbowColors[i]);
        }
    }
}
