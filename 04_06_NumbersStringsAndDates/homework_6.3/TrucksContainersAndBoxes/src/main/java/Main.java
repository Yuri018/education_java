import java.util.Scanner;

public class Main {

     static int  maxBoxInCont = 27;
    static int maxContInTrack = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes);

        int countCont = (box / maxBoxInCont) <= maxBoxInCont? maxBoxInCont: maxBoxInCont++;
        int countTrack = (countCont / maxContInTrack) <= maxContInTrack? maxContInTrack:
                maxContInTrack++;

        int numCont = 0;
        int numTrack = 0;

        for (int i = 1; i <= box; i++){
            if ((i % (countCont * countTrack)) == 1){
                numTrack++;
                System.out.println("Грузовик: " + numTrack);
            }
            if (i % countCont == 1){
                numCont++;
                System.out.println("\t" + "Контейнер: " + numCont);
            }
            System.out.println("\t" + "\t" + "Ящик: " + i);
        }
        System.out.println("Необходимо:\n" + "грузовиков - " + numTrack + " шт.\n"
        + "контейнеров - " + numCont + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
