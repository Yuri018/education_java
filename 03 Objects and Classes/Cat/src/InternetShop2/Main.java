package InternetShop2;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,2,200.0);
        basket.add("Butter", 56,125.0);
        basket.print("В корзине: ");
        basket.basketTotalWeight();
//        System.out.println("Общий вес корзины: " + basket.getTotalWeight());

//        Arithmetic arithmetic = new Arithmetic(2, 3);
//        System.out.println(arithmetic.sum());
//
//        Printer printer = new Printer();
//        printer.append("testing");
//        printer.append("new testing");
//        System.out.println(printer.queue);
    }
}
