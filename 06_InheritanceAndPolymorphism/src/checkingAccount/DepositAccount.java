package checkingAccount;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DepositAccount extends BankAccount {

    //переменная для запоминания даты и времени пополнения депозитного счета
    private LocalDate refillDate;

    //конструктор класса DepositAccount (создается средой разработки)
    public DepositAccount(double balance) {
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

    //метод задает время действия со счетом
    public String refillDate() {
        refillDate = LocalDate.now().minusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return refillDate.format(formatter);
    }

    //метод расчета снятия с депозитного счета минимум через месяц
    public boolean withdrawalDate() {
        if (refillDate != null) {
            return refillDate.plusMonths(1).compareTo(LocalDate.now()) <= 0;
        } else {
            return true;
        }
    }

    //переопределяем метод пополнения счета - добавляем дату внесения средств
    @Override
    public void putMoney() {
        refillDate();
        super.putMoney();
        System.out.println("Дата пополнения депозитного счета: " + refillDate());
    }

    //переопределяем метод снятия со счета - добавляем метод, разрешающий снятие через месяц
    @Override
    public double getMoney() {
        if (withdrawalDate()) {
            super.getMoney();
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Снятие с депозитного счета возможно не ранее " +
                    refillDate.plusMonths(1).format(formatter));
        }
        return 0;
    }

    @Override
    public void balance() {
        System.out.println("Баланс депозитного счета - " + getBalance());
    }
}
