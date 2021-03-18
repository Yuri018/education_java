package InternetShop;

public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Колбаса", 76);
        vasyaBasket.add("Масло", 55, 2);

        Basket petyaBasket = new Basket(5000);
        petyaBasket.add("Молоко", 128, 3, 200);
        petyaBasket.add("Сыр", 180, 4, 350);

        Basket machaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Содержимое корзины Васи");
        System.out.println();
        petyaBasket.print("Содержимое корзины Пети");
        System.out.println();
        machaBasket.print("Содержимое корзины Маши");

    }
}
