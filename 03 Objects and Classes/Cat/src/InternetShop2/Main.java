package InternetShop2;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");

        Arithmetic arithmetic = new Arithmetic(2, 3);
        System.out.println(arithmetic.sum());
    }
}
