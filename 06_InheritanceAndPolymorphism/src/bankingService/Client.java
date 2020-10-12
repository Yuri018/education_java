package bankingService;

//создаем абстрактный класс с переменной класса Balance и методами поплнения баланса,
// снятия со счета и просмотра остатка на балансе

public abstract class Client {

    //поле абстрактного класса Client, с балансом - одинаковым для всех методов (клиентов банка)
    private double balance = 1000;

    //геттером можно проверить баланс счета
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //создаем абстрактный метод пополнения баланса (должен быть у всех классов наследников
    public abstract void putMoney(double amount);

    //создаем абстрактный метод снятия с баланса (должен быть у всех классов наследников
    public abstract void getMoney(double amount);

    public abstract void clientInfo();


}
