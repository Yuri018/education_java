import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000;
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000;

    public static void main(String[] args)
    {
        //Домашнее задание со звездочкой
      double minIncome = ((minInvestmentsAmount / (1 - mainTaxPercent))
         + calculateFixedCharges()) / (1 - managerPercent);

        System.out.println("Минимальный доход, при котором возможно инвестирование\n" +
                "составляет: " + minIncome);

        while(true)
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt();
// С помощью класса "Scanner" присваиваем переменной int income
// значение, введенное в консоли.
            if(!checkIncomeRange(income)) {
//в методе "checkIncomeRange" со значением "income" проверяем границы минимальной
// и максимальной ввведенной суммы. В случае "return false" с помощью оператора "!" значение меняется
// на противоположное для перехода к вычислениям. В случае "return true" с помощью оператора "!" значение
// меняется на противоположное и выполняется действие в { }
                continue; // и программа начинается заново
            }

            double managerSalary = income * managerPercent;     // расчет зарплаты менеджера
            double pureIncome = income - managerSalary -
                calculateFixedCharges();                        // расчет прибыли до налогообложения
            double taxAmount = mainTaxPercent * pureIncome;     // расчет налога с прибыли
            double pureIncomeAfterTax = pureIncome - taxAmount; // расчет чистой прибыли

            boolean canMakeInvestments = pureIncomeAfterTax >=  // сравнение суммы прибыли с минимально
                minInvestmentsAmount;                           // допустимой для инвестирования
                                                                            //Вывод в консоль:
            System.out.println("Зарплата менеджера: " + managerSalary); // Зарплата менеджера
            System.out.println("Общая сумма налогов: " +                // Сумма налогов
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +       // Решение об инвестировании
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {                // в случае отрицательного баланса доходов и расходов компании
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
// Метод проверки соответствия переменной "income" заданным значениям в классе "Main"
    {
        if(income < minIncome)
        {
            System.out.println("Доход меньше нижней границы");
            return false;
//возвращаемое значение в блок "if" в случае если "income < minIncome"
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
//возвращаемое значение в блок "if" в случае если "income > minIncome"
        }
        return true;
//возвращаемое значение в блок "if" в случае если " minIncome < income > maxIncome"
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +           //
                telephonyCharge +           //
                internetAccessCharge +      // фиксированные расходы
                assistantSalary +           //
                financeManagerSalary;       //
    }
}
