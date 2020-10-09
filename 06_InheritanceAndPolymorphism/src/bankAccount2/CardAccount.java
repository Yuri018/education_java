package bankAccount2;

public class CardAccount extends Account {

    // override the withdrawal method - add the calculation of the percentage of the withdrawal amount
    @Override
    public void getMoney(double amount) {
        double percent = amount * 0.01;
        super.getMoney(amount - percent);
    }

    @Override
    boolean send(Account receiver, double amount) {
        return super.send(receiver, amount - (amount * 0.01));
    }
}

