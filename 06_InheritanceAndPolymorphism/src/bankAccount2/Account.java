package bankAccount2;

// create a class. In it we create methods of withdrawal from the account (no commission),
// deposit into the account (no commission), view the account balance
public class Account {

    // class field BankAccount
    private double balance;

    // view the account balance
    public double getBalance() {
        return balance;
    }

    // create a method to replenish the balance
    public void putMoney(double amount) {
        this.balance += amount;
    }

    // create a method for withdrawing funds from the account
    public void getMoney(double amount) {
        System.out.println("Get money - " + amount);

        if (balance - amount < 0) {
            System.out.println("Insufficient funds on the account");
        } else {
            balance -= amount;
        }

    }
}
