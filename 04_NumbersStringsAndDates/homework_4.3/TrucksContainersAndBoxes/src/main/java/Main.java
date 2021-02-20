import java.util.Scanner;

public class Main {
    public static int container = 27;
    public static int truck = 12;

    public static void main(String[] args) {

//        System.out.println("Введите количество ящиков");
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        //максимальное количество ящиков в контейнере задаем по условию:
        int needCont = (box / container) <= container ? container : container++;
        //максимальное количество контейнеров в грузовике задаем по условию:
        int needTruck = (needCont / truck) <= truck ? truck : truck++;
        int numCont = 0;
        int numTruck = 0;

        for (int i = 1; i <= box; i++) {
            if ((i % (needTruck * needCont)) == 1) {
                numTruck++;
                System.out.println("Грузовик: " + numTruck);
            }
            if (i % needCont == 1) {
                numCont++;
                System.out.println("\t" + "Контейнер: " + numCont);
            }
            System.out.println("\t" + "\t" + "Ящик: " + i);
        }
        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + numTruck + " шт.");
        System.out.println("контейнеров - " + numCont + " шт.");
    }
}
