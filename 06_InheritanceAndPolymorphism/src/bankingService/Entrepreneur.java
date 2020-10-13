package bankingService;

public class Entrepreneur extends Client {

    private static final double PUT_PERCENT1 = 1.01;// комиссия - в зависимости от суммы снятия
    private static final double PUT_PERCENT2 = 1.005;

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void putMoney(double amount) {
        if (amount < 1000) {
            setBalance(getBalance() + (amount * PUT_PERCENT1));
            System.out.printf("%s %.3f%n", "Balance replenishment - ", (amount * PUT_PERCENT1));
        } else {
            setBalance(getBalance() + (amount * PUT_PERCENT2));
            System.out.printf("%s %.3f%n", "Balance replenishment - ", (amount * PUT_PERCENT2));
        }
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void getMoney(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds on the account to withdraw " + amount);
        } else {
            setBalance(getBalance() - amount);
            System.out.format("%s %.3f%n", "Withdrawal from balance - ", amount);
        }
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For Entrepreneurs:\nBalance replenishment up to 1000.00 - 1%\n" +
                "Balance replenishment from 1000.00 - 0.5%\nwithdrawal from balance - 0%\n");
    }
}
