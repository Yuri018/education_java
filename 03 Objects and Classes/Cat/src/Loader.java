import com.skillbox.airport.Airport;
import transport.Cargo;

public class Loader {
    public static void main(String[] args) {
        Cat vasia = new Cat();
        System.out.println("Количество кошек " + Cat.getCount());

        for (vasia.getWeight(); vasia.getWeight() < 9000; vasia.feed(2000.0))
        {
            System.out.println("Васька увеличивает вес " + vasia.getWeight());
        }
        System.out.println(vasia.getStatus());
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Количество кошек " + Cat.getCount());

        Cat muska = new Cat();
        System.out.println("Количество кошек " + Cat.getCount());
        for (muska.getWeight(); muska.getWeight() > Cat.MIN_WEIGHT; muska.meow())
        {
            System.out.println("Муська мяукает и уменьшает вес " + muska.getWeight());
        }
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Количество кошек " + Cat.getCount());


    }
}