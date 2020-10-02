package checkingAccount;

public class CardAccount extends BankAccount {

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

    //метод расчета суммы при снятии с карточного счета с учетом процентов
    public void getMoneyMinusPercent() {
        System.out.println("Введите сумму для снятия: ");
        double amount = scanner.nextDouble();
        double percent = 1.0;
        double calculatePercentage = (percent * amount / 100);
        amount -= calculatePercentage;

        if (getBalance() - amount < 0) {
            System.out.println("Недостаточно средств на счете");
        } else {setBalance(getBalance() - amount);
            System.out.println("Снятие со счета - " + amount);
        }
    }

    @Override
    public void putMoney(double amount) {
        super.putMoney(amount);
    }

    @Override
    public void balance() {
        System.out.println("Карточный счет - Balance: " + getBalance());
    }
}
