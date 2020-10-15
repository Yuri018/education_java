package bankingService;

public class LegalEntity extends Client {

    private static final double GET_PERCENT = 1.01; // комиссия за снятие со счета

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    protected double getReplenishCommission(double amount) {
        return amount;
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    protected double getWithdrawCommission(double amount) {
        return amount * GET_PERCENT;
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For legal entities:\nBalance replenishment - 0%\nwithdrawal from balance - 1%\n");
    }
}
