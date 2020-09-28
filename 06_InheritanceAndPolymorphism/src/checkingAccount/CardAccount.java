package checkingAccount;

public class CardAccount extends BankAccount {

    //поле класса CardAccount - переменная процент(удерживается при снятии)
    double percent = 1.0;

    //конструктор класса CardAccount (создается средой разработки)
    public CardAccount(double balance) {
        super(balance);
    }

    //метод расчета суммы при снятии с карточного счета
    @Override
    public void getMoney(double amount) {
        double calculatePercentage = (percent * amount / 100);
        amount -= calculatePercentage;
        super.getMoney(amount);
        System.out.println("Снято - " + amount);
    }
}
