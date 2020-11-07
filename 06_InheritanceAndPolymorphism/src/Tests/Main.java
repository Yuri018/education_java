package Tests;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(40);
        System.out.println(square.getSquare());
        System.out.println(square.getCreationTime());

        Square square1 = new Square(50,50);
        System.out.println(square1.getSquare());
        System.out.println(square1.getCreationTime());

        Square rectangle = new Square(50, 60);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getCreationTime());

    }
}
