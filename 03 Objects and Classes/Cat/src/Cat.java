
public class Cat {
    public static final double MIN_WEIGHT = 1000.0;
    public static final double MAX_WEIGHT = 9000.0;

    private final double originWeight;
    private static double weight;

    private static int count;//переменная класса для подсчета кошек
    private double feedAmount;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public static int getCount() {
        return count;
    }

//    public void pee() {
//        if (weight > MIN_WEIGHT) {
//            weight = weight - (weight * 0.05);
//            System.out.println("Cat went to the toilet");
//            if (weight < MIN_WEIGHT) {
//                count--;
//            }
//        } else {
//            System.out.println("Кошка мертва");
//        }
//    }

    public void meow() {
        if (weight > MIN_WEIGHT) {
            weight = weight - 700;
            if (weight < MIN_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Кошка домяукалась");
        }
    }


    public void feed(double amount) {
        if (weight < MAX_WEIGHT) {
            weight = weight + amount;
            feedAmount = feedAmount + amount;
            if (weight > MAX_WEIGHT) {
                count--;
            }
        } else {
            System.out.println("Кошка мертва");
        }
    }

//    public void drink(Double amount) {
//        if (weight < MAX_WEIGHT) {
//            weight = weight + amount;
//            feedAmount = feedAmount + amount;
//            if (weight > MAX_WEIGHT) {
//                count--;
//            }
//        } else {
//            System.out.println("Кошка мертва");
//        }
//    }


    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}