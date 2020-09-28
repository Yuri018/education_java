package checkingAccount;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    //переменная для запоминания даты и времени пополнения депозитного счета
    private LocalDate month;

    //конструктор класса DepositAccount (создается средой разработки)
    public DepositAccount(double balance) {
        super(balance);
    }

    //метод, который задаст время действия со счетом
//    private void setCreationTime() {
//        creationTime = new Date();
//    }
    //метод, который возвращает дату создания объекта в методе Main
    // (при обращении к конструктору класса DepositAccount)
//    public Date getCreationTime() {
//        return creationTime;
//    }

    //метод, который задаст время действия со счетом
    private void setMonth() {
        month = LocalDate.now();
    }

    //метод возвращает дату создания объекта в методе Main
    // (при обращении к конструктору класса DepositAccount)
    public LocalDate getMonth() {
        return month;
    }

    //переопределяем метод пополнения счета - добавляем дату внесения средств
    @Override
    public void putMoney(double amount) {
        super.putMoney(amount);
        setMonth();
    }

    //переопределяем метод снятия с депозитного счета по истечении месяца
    @Override
    public void getMoney(double amount) {
        super.getMoney(amount);
        LocalDate getDate = LocalDate.now();
        if (getDate.isAfter(month)) {//пока не понятно

        }
    }
}
