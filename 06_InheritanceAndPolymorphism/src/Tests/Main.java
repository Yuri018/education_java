package Tests;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(40);
        Square square1 = new Square(50,50);
        Rectangle rectangle = new Rectangle(50, 60);
        System.out.println(square.getSquare());
        System.out.println(square1.getSquare());
        System.out.println(rectangle.getSquare());

    }
}
