package Tests;

public class Rectangle {
// класс Прямоугольник

    public int width;
    public int height;

    //создаем конструктор
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    //создаем геттеры и сеттеры для переменных (полей) класса Rectangle
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //создаем метод расчета площади прямоугольника
    public int getSquare(){
        return width * height;
    }
}
