package bankingService;

public class LegalEntity extends Client{

    private static final double PERCENT = 1.01; // комиссия за снятие со счета


    @Override
    public void putMoney(double amount) {
        super.setBalance(getBalance() + amount);
        System.out.printf("%s %.2f%n", "Put money - ", amount);
    }

    @Override
    public void getMoney(double amount) {
        double amountWithCommission = amount * PERCENT;
        if (getBalance() - (amountWithCommission) < 0) {
            System.out.println("Insufficient funds on the account");
        } else {
            setBalance(getBalance() - amountWithCommission);
        }

    }

    @Override
    public void clientInfo() {
        System.out.println("fffff");
    }

}
