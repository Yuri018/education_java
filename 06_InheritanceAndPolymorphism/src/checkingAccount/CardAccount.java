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
    public void putMoney(double amount) {
        super.putMoney(amount);
    }

    //метод расчета суммы при снятии с карточного счета с учетом процентов
//    public void getMoneyMinusPercent() {
//        System.out.println("Введите сумму для снятия: ");
//        double amount = scanner.nextDouble();
//        setPercent(1.0);
//        double calculatePercentage = (percent * amount / 100);
//        amount -= calculatePercentage;
//
//        if (getBalance() - amount < 0) {
//            System.out.println("Недостаточно средств на счете");
//        } else {setBalance(getBalance() - amount);
//            System.out.println("Снятие со счета - " + amount);
//        }
//    }

    @Override
    public double getMoney() {
        setPercent(2.0);
        return super.getMoney() * percent / 100 ;


//        double i = super.getMoney(amount);
//
//        double v = i * percent / 100;
//        System.out.println("Снятие со счета - " + v);
//        return i;
    }


    @Override //переопределяем метод вывода баланса
    public void balance() {
        System.out.println("Баланс карточного счета - " + getBalance());
    }
}
