package bankAccount2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DepositAccount extends Account {

    // variable of the date of replenishment of the deposit account
    private LocalDate refillDate;

//    @Override
//    public double getBalance() {
//        return super.getBalance();
//    }

    // override the deposit method - add the deposit date
    @Override
    public void putMoney(double amount) {
        refillDate();
        super.putMoney(amount);
//        System.out.println("Date of replenishment of the deposit account: " + refillDate());
    }

    // override the withdrawal method - add the verification method and the withdrawal date
    @Override
    public void getMoney(double amount) {
        if (withdrawalDate()) {
            super.getMoney(amount);
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Withdrawal from a deposit account is possible - " +
                    refillDate.plusMonths(1).format(formatter));
        }
    }

    // method sets the time of action with the account
    public String refillDate() {
        refillDate = LocalDate.now();//set the date minus 1 month to test the method
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return refillDate.format(formatter);
    }

    // method for calculating withdrawals from the deposit account
    public boolean withdrawalDate() {
        if (refillDate != null) {
            return refillDate.plusMonths(1).compareTo(LocalDate.now()) <= 0;
        } else {
            return true;
        }
    }

    @Override
    boolean send(Account receiver, double amount) {
        if (withdrawalDate()) {
            return super.send(receiver, amount);
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Transfer from a deposit account is possible - " +
                    refillDate.plusMonths(1).format(formatter));
        }
        return false;
    }
}
