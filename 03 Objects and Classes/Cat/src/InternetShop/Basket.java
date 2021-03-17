package InternetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;

    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice += price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        if (items.contains(name)) {
            return true;
            //если используется ключевое слово return, то else писать не нужно
        }
        return false;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
