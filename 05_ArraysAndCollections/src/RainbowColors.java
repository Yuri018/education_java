public class RainbowColors {
    public static void main(String[] args) {
        String[] rainbowColors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};

        // цикл для перебора элементов массива в обратном порядке
        for (int i = rainbowColors.length - 1; i >= 0 ; i--) {
            System.out.println(rainbowColors[i]);
        }
    }
}
