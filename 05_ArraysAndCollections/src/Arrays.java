import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //создаем двухмерный массив в который запишутся значения из консоли
        int[][] array2 = new int[a][b];
        //инициялизация (заполнение) массива
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = i * j + 1;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" " + array2 [i][j]);
            }
            System.out.println("\n");
        }
    }
}
