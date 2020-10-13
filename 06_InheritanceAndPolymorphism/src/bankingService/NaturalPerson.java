package bankingService;

public class NaturalPerson extends Client {

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void putMoney(double amount) {
        setBalance(getBalance() + amount);
        System.out.printf("%s %.2f%n", "Balance replenishment - ", amount);
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void getMoney(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds on the account to withdraw" + amount);
        } else {
            setBalance(getBalance() - amount);
            System.out.format("%s %.2f%n", "Withdrawal from balance - ", amount);
        }
    }

    //имплементируем абстрактный метод абстрактного класса Client
    @Override
    public void clientInfo() {
        System.out.println("For individuals:\nBalance replenishment - 0%\nwithdrawal from balance - 0%\n");
    }
}