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
        System.out.printf("%s %.2f%n", "Put money - ", amount);
    }

    public void transfer(double amount) {
        this.balance += amount;
        System.out.printf("%s %.2f%n", "Transfer money - ", amount);
    }

    // create a method for withdrawing funds from the account
    public void getMoney(double amount) {
        System.out.format("%s %.2f%n", "Get money - ", amount);

        if (balance - amount < 0) {
            System.out.println("Insufficient funds on the account");
        } else {
            balance -= amount;
        }
    }

    //create a method of transfer to another account
    boolean send(Account receiver, double amount) {
        if (balance - amount <= 0) {
            System.out.printf("%s %.2f%n", "Insufficient funds to transfer - ", amount);
            return false;
        }else {
            receiver.transfer(amount);
            balance -= amount;
            return true;
        }
    }

}
