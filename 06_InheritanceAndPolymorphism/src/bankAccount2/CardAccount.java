package bankAccount2;

public class CardAccount extends Account {

    private double percent;

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    // override the balance refill method
    @Override
    public void putMoney(double amount) {
        super.putMoney(amount);
    }

    // override the withdrawal method - add the calculation of the percentage of the withdrawal amount
    @Override
    public void getMoney(double amount) {
        setPercent(amount * 1.0 / 100);
        super.getMoney(amount - percent);
    }

}

