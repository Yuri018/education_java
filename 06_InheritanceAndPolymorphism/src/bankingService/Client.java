package bankingService;

//создаем абстрактный класс с переменной класса Balance и методами пополнения баланса,
// снятия со счета и просмотра остатка на балансе

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

    //создаем абстрактный метод пополнения баланса (должен быть у всех классов наследников)
    public abstract void putMoney(double amount);

    //создаем абстрактный метод снятия с баланса (должен быть у всех классов наследников)
    public abstract void getMoney(double amount);

    //создаем абстрактный метод информирования клиентов об условиях (должен быть у всех классов наследников)
    public abstract void clientInfo();

}
