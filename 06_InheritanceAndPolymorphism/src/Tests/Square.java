package Tests;

//создаем класс Квадрат и (с помощью extends) наследуем все методы и переменные из класса Rectangle
public class Square extends Rectangle {

    //создается конструктор
    public Square(int width, int height) {
        // который вызызвает конструктор родительского класса
        super(width, height);
        //у квадрата все стороны навны, поэтому если не равны выводим предупреждение
        if (width != height){
            System.out.println("Высота не равна ширине");
        }
    }
    //создаем конструктор с одним параметром (т.к. высота и ширина равны)
    public Square(int width){
        super(width, width);
    }

    @Override
    //переписываем (переопределяем) методы из класса Rectangle
    public void setWidth(int width) {
        setWidth(width);
        setHeight(width);
    }
    public void setHeight(int height){
        setHeight(height);
        setWidth(height);
    }
}
