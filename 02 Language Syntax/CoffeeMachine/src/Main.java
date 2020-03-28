public class Main {
    public static void main(String[] args) {

        int moneyAmount = 10;

        int americanoPrice = 180;
        int capuchinoPrice = 120;
        int lattePrice = 80;
        int waterPrice = 20;

        boolean canBay = false;

        if (moneyAmount >= americanoPrice) {
            System.out.println("Вы купите Американо");
            canBay = true;
        }
        if (moneyAmount >= capuchinoPrice) {
            System.out.println("Вы купите Капучино");
            canBay = true;
        }
        if (moneyAmount >= lattePrice) {
            System.out.println("Вы купите Латте");
            canBay = true;
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы купите воду");
            canBay = true;
        }
        if (canBay == false) {
            System.out.println("Денег не хватает");
        }
    }
}
