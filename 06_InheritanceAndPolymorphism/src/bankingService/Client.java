package bankingService;

/*
 создаем абстрактный класс с переменной класса Balance и методами пополнения баланса,
 снятия со счета и просмотра остатка на балансе
 */

public abstract class Client {

    //поле абстрактного класса Client, с балансом - одинаковым для всех методов (клиентов банка)
    private double balance = 1000;

    //геттером проверяем баланс счета
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //абстрактный метод возвращает рачсет процентов при пополнении баланса
    protected abstract double getReplenishCommission(double amount);

    //абстрактный метод возвращает рачсет процентов при снятии с баланса
    protected abstract double getWithdrawCommission(double amount);

    //создаем метод пополнения баланса (должен быть у всех классов наследников)
    public void putMoney(double amount) {
        balance += getReplenishCommission(amount);
        System.out.printf("%s %.2f %s %n", "Balance replenishment - ", amount, "\u20bd");
    }

    //создаем метод снятия с баланса (должен быть у всех классов наследников)
    public void getMoney(double amount) {
        if (balance - getWithdrawCommission(amount) < 0) {
            System.out.println("Insufficient funds on the account to withdraw " + amount + "\u20bd");
        } else {
            setBalance(balance - getWithdrawCommission(amount));
            System.out.format("%s %.2f %s %n", "Withdrawal from balance - ", amount, "\u20bd");
        }
    }

    //создаем абстрактный метод информирования клиентов об условиях (должен быть у всех классов наследников)
    public abstract void clientInfo();

}
