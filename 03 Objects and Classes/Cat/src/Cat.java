
public class Cat
{
    public static final int EYES_COUNT = 2;
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    private double originWeight;
    private static double weight;

//    private static double minWeight;
//    private static double maxWeight;
    private static int count;//переменная класса для подсчета кошек
    private String name;
    private double feedAmount;
    private boolean alive;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
//        minWeight = 1000.0;
//        maxWeight = 9000.0;
        count++;
    }
    public Cat(double originWeight, double weight, double minWeight, double maxWeight)
    {
        this.originWeight = originWeight;
        this.weight = weight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public Cat (Cat copy){
        this(copy.originWeight, copy.weight, Cat.MIN_WEIGHT, copy.maxWeight);
    }

    public Cat(double weight){
        this.weight = weight;
    }

    public static void setCount(int count) {
        Cat.count = count;
    }

    public static int getCount()
    {
         return count;
    }

//    public boolean isAlive() {
//        if (weight > MIN_WEIGHT & weight < MAX_WEIGHT) {
//            return true;
//        }
//        return false;
//    }

    public double getFeedAmount()
    {
        return feedAmount;
    }

    public void pee() {
        if (weight > MIN_WEIGHT) {
        weight = weight - (weight * 0.05);
        System.out.println("Cat went to the toilet");
            if (weight < MIN_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Кошка мертва");
        }
    }

    public void meow() {
        if (weight > MIN_WEIGHT) {
            weight = weight - 700;
//            System.out.println("Meow");
            if(weight < MIN_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Кошка домяукалась");
        }
    }


public void feed(double amount) {
    if(weight < MAX_WEIGHT) {
        weight = weight + amount;
        feedAmount = feedAmount + amount;
        if (weight > MAX_WEIGHT){
            count--;
        }
    }else {
        System.out.println("Кошка мертва");
    }
}

    public void drink(Double amount) {
        if(weight < MAX_WEIGHT) {
            weight = weight + amount;
            feedAmount = feedAmount + amount;
            if (weight > MAX_WEIGHT){
                count--;
            }
        }else {
            System.out.println("Кошка мертва");
        }
    }


    public Double getWeight()
    {
//        isAlive();
        return weight;
    }

    public String getStatus()
    {
        if(weight < MIN_WEIGHT) {
            return "Dead";
        }
        else if(weight > MAX_WEIGHT) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}