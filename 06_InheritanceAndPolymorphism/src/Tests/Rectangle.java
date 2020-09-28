package Tests;

import java.util.Date;

public class Rectangle {
// класс Прямоугольник

    private int width;
    public int height;
    private Date creationTime;

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
    private void setCreationTime() {
        creationTime = new Date();
    }
    public Date getCreationTime() {
        return creationTime;
    }
}
