package bankingService;

public class NaturalPerson extends Client {


    @Override
    public void putMoney(double amount) {
        setBalance(getBalance() + amount);
        System.out.printf("%s %.2f%n", "Put money - ", amount);
    }

    @Override
    public void getMoney(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds on the account");
        } else {
            setBalance(getBalance() - amount);
            System.out.format("%s %.2f%n", "Get money - ", amount);
        }

    }
}