package InternetShop;

public class Basket {
    private String items;
    private int totalPrice = 0;
    public int limit;
    public int totalBasketWeight = 0;

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
        add(name, price, 1, 0);//вызываем метод add с тремя параметрами, чтобы
        // этот метод с двумя параметрами тоже работал
    }

    //такой перегруженный метод написать нельзя
//    public void add(String name, int count){
//    }
    //а вот такой можно, потому что параметры метода имеют другой порядок написания
//    public void add(int price, String name){
//    }

    public void add(String name, int price, int count){
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int count, int weight){
        int totalWeight;
        if (contains(name)) {
            return;
        }
        if ((totalPrice += count * price) >= limit) {
            return;
        }
        totalPrice += count * price;
        totalWeight =  count * weight;
        items = items + "\n" + name + " - " + count + "шт. - " + price + " руб." + " - "
        + "Вес " + totalWeight + " гр.";
        this.totalBasketWeight += totalWeight;
    }

    public int basketWeight(){
        return totalBasketWeight;
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
            System.out.println(basketWeight());
        }
    }
}
