package checkingAccount;

public class CardAccount extends BankAccount {

    private double percent;

    //геттер для приватного поля класса CardAccount
    public double getPercent() {
        return percent;
    }

    //сеттер для приватного поля класса CardAccount
    public void setPercent(double percent) {
        this.percent = percent;
    }

    //конструктор класса CardAccount (создается средой разработки)
    public CardAccount(double balance) {
        super(balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
    }

    //переопределяем метод пополнения счета
    @Override
    public void putMoney() {
        super.putMoney();
    }

    //переопределяем метод снятия со счета - добавляем расчет процента от суммы снятия
    @Override
    public double getMoney() {
        double sumPercent = super.getMoney() * percent() / 100;
        System.out.println("Сумма процентов с карточного счета " + sumPercent);
        setBalance(getBalance() + sumPercent);
        System.out.println("Сумма снятия с комиссией: ");

        return 0;

    }
    public double percent() {
        setPercent(1.0);
        return percent;
    }

    @Override //переопределяем метод вывода баланса
    public void balance() {

        System.out.println("Баланс карточного счета - " + getBalance());
    }
}
