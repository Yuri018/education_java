package InternetShop;

public class Basket {
    private String items;
    private int totalPrice = 0;
    public int limit;

    public Basket(){
        items = "список товаров";
        limit = 10000;
    }

    //создаем конструктор класса Basket с параметром  limit
    public Basket(int limit) {
        //чтобы выводилось items = "список товаров" просто допишем this()
        //ссылаясь на конструктор без параметров, где есть эта строка
        this();
        this.limit = limit;
    }

    //создаем конструктор класса Basket с двумя параметрами
    public Basket(String items, int totalPrice){
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }


    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        if ((totalPrice += price) >= limit) {
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