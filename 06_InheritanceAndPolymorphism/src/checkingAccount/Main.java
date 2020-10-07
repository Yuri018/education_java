package checkingAccount;

public class Main {
    public static void main(String[] args) {

        double amount = 0.0;
        BankAccount bankAccount = new BankAccount();
//
//        bankAccount.balance();//вывод на печать с помощью метода balance() в классе BankAccount
//        bankAccount.putMoney();
//        bankAccount.balance();
//        bankAccount.getMoney(amount);
//        bankAccount.balance();
//        System.out.println("________________________________________");
//
//        DepositAccount depositAccount = new DepositAccount();
//
//        depositAccount.balance();
//        depositAccount.putMoney();
//        depositAccount.balance();
//        depositAccount.getMoney(amount);
//        depositAccount.balance();
//        System.out.println("________________________________________");

        CardAccount cardAccount = new CardAccount();

        cardAccount.balance();
        cardAccount.putMoney();
        cardAccount.balance();
        cardAccount.getMoney(amount);
        cardAccount.balance();

    }
}
