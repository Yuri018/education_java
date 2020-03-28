import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    private static double passengerCarMaxWeight = 3500.0; // kg переменная типа double
    private static int passengerCarMaxHeight = 2000; // mm      переменная типа int
    private static int controllerMaxHeight = 3500; // mm        переменная типа int
//изменено значение  переменной "controllerMaxHeight" согласно задания
    private static int passengerCarPrice = 100; // RUB          переменная типа int
    private static int cargoCarPrice = 250; // RUB              переменная типа int
    private static int vehicleAdditionalPrice = 200; // RUB     переменная типа int

    public static void main(String[] args)
    {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();                  // переменная типа int

        for(int i = 0; i < carsCount; i++)                  // переменная типа int
        {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);                // переменная типа int
            if(price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car)
    {
        int carHeight = car.height;                         // переменная типа int
        int price = 0;                                      // переменная типа int
        if (carHeight > controllerMaxHeight)
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight)
        {
            double weight = car.weight;                     // переменная типа double
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)
            {
                price = cargoCarPrice;  // Здесь ранее переменной "price" присваивалось значение "passengerCarPrice"
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = passengerCarPrice; // Здесь ранее переменной "price" присваивалось значение "cargoCarPrice"
            }
        }
        else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}