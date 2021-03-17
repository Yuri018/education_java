package InternetShop;

public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Колбаса", 76);
        vasyaBasket.add("Масло", 55);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Молоко", 128);
        petyaBasket.add("Сыр", 180);

        vasyaBasket.print("Содержимое корзины Васи");
        System.out.println();
        petyaBasket.print("Содержимое корзины Пети");
//        add("Колбаса", 76);
//        add("Масло", 55);
//        add("Молоко", 128);
//        print("Содержимое корзины");
//        System.out.println("Общаяя стоимость товаров " + getTotalPrice());
//        clear();
//        print("Содержимое корзины");
//        System.out.println(getTotalPrice());
    }
}
