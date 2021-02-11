package Tests;

import java.time.LocalDate;

public abstract class Rectangle {
// класс Прямоугольник

    private final int width;
    private final int height;
    private LocalDate creationTime;

    //создаем конструктор
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        setCreationTime();
    }
    //создаем геттеры и сеттеры для переменных (полей) класса Rectangle
    public int getWidth() {
        return width;
    }

    public abstract void setWidth(int width);

    public int getHeight() {
        return height;
    }

    public abstract void setHeight(int height);

    //создаем метод расчета площади прямоугольника
    public int getSquare(){
        return width * height;
    }
    private void setCreationTime() {
        creationTime = LocalDate.now();
    }
    public LocalDate getCreationTime() {
        return creationTime;
    }
}
