package bankingService;

public class NaturalPerson extends Client {

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    protected double getReplenishCommission(double amount) {
        return amount;
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    protected double getWithdrawCommission(double amount) {
        return amount;
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For individuals:\nBalance replenishment - 0%\nwithdrawal from balance - 0%\n");
    }
}