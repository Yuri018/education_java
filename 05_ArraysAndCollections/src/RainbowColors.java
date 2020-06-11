public class RainbowColors {
    public static void main(String[] args) {
        String[] rainbowColors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        for (int i = 0; i < rainbowColors.length; i++) {
            System.out.println(rainbowColors[i]);
        }
        System.out.println("--------------------------");

        int n = rainbowColors.length;
        String temp;//временная переменная для хранения значений
//для замены элементов массива местами необходимо пройти только половину массива n/2
        for (int i = 0; i < n/2; i++) {
            temp = rainbowColors[n - i - 1];
            rainbowColors[n - i - 1] = rainbowColors[i];
            rainbowColors[i] = temp;
        }
//        for (int i = 0; i < rainbowColors.length; i++) {
//            System.out.println(rainbowColors[i]);
//        }
        for (String x: rainbowColors) {
            System.out.println(x);
        }
//        //второй вариант перебора массива, если не нужен индекс элемента
//        for (String x: rainbowColors) {
//            System.out.println(x);
//        }
//        System.out.println("--------------------------");
//        // цикл для перебора элементов массива в обратном порядке
//        for (int i = rainbowColors.length - 1; i >= 0 ; i--) {
//            System.out.println(rainbowColors[i]);
//        }
    }
}
