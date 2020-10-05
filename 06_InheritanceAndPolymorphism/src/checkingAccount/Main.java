package checkingAccount;

public class Main {
    public static void main(String[] args) {

        double amount = 0.0;
//        BankAccount bankAccount = new BankAccount(0.0);
//
//        bankAccount.balance();//вывод на печать с помощью метода balance() в классе BankAccount
//        bankAccount.putMoney(amount);
//        bankAccount.balance();
//        bankAccount.getMoney();
//        bankAccount.balance();
//        System.out.println("________________________________________");
//
//        DepositAccount depositAccount = new DepositAccount(0.0);
//
//        depositAccount.balance();
//        depositAccount.putMoney(amount);
//        depositAccount.balance();
//        depositAccount.getMoney();
//        depositAccount.balance();
//        System.out.println("________________________________________");

        CardAccount cardAccount = new CardAccount(0.0);

//        cardAccount.balance();
        cardAccount.putMoney(amount);
//        cardAccount.balance();
        cardAccount.getMoney();
        cardAccount.balance();


    }
}
