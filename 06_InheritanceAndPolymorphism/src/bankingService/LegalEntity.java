package bankingService;

public class LegalEntity extends Client{

    private static final double GET_PERCENT = 1.01; // комиссия за снятие со счета

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void putMoney(double amount) {
        super.setBalance(getBalance() + amount);
        System.out.printf("%s %.3f%n", "Balance replenishment - ", amount);
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void getMoney(double amount) {
        double amountWithCommission = amount * GET_PERCENT;
        if (getBalance() - (amountWithCommission) < 0) {
            System.out.println("Insufficient funds on the account to withdraw " + amount);
        } else {
            setBalance(getBalance() - amountWithCommission);
            System.out.format("%s %.3f%n", "Withdrawal from balance - ", amount);
        }
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For legal entities:\nBalance replenishment - 0%\nwithdrawal from balance - 1%\n");
    }
}
