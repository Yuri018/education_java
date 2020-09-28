package checkingAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.00);
        System.out.println("Простой счет - Balance: " + bankAccount.getBalance());// вывод на печать с помощью геттера
        bankAccount.getMoney(200);

//        DepositAccount depositAccount = new DepositAccount(2000);
//        depositAccount.putMoney(500);
//        System.out.println("putMoney " + depositAccount.getMonth());
//
//        System.out.println("Депозитный счет - Balance: " + depositAccount.getBalance());// вывод на печать с помощью геттера

        CardAccount cardAccount = new CardAccount(1000.0);
        System.out.println("Карточный счет - баланс: " + cardAccount.getBalance());
        cardAccount.getMoney(200.0);
        System.out.println("Карточный счет - баланс: " + cardAccount.getBalance());



    }
}
