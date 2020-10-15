package bankingService;

public class Entrepreneur extends Client {

    private static final double PUT_PERCENT1 = 1.01;// комиссия - в зависимости от суммы снятия
    private static final double PUT_PERCENT2 = 1.005;

    @Override
    protected double getReplenishCommission(double amount) {
        if (amount < 1000) {
            return amount * PUT_PERCENT1;
        } else {
            return amount * PUT_PERCENT2;
        }
    }

    @Override
    protected double getWithdrawCommission(double amount) {
        return amount;
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For Entrepreneurs:\nBalance replenishment up to 1000.00 - 1%\n" +
                "Balance replenishment from 1000.00 - 0.5%\nwithdrawal from balance - 0%\n");
    }
}
