package checkingAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.00);
        bankAccount.putMoney(200);
        bankAccount.balance();
        bankAccount.getMoney(300);
        bankAccount.balance();
    }
}
