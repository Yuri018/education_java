package bankAccount2;

public class Loader {
    public static void main(String[] args) {
        Account account = new Account();
        CardAccount cardAccount = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();

        account.putMoney(100);
        System.out.printf("%s %.2f%n", "Account balance - ", account.getBalance());
        account.getMoney(101);
        System.out.printf("%s %.2f%n", "Account balance - ", account.getBalance());
        account.send(depositAccount, 150);
        account.send(depositAccount, 90.85);

        System.out.printf("%s %.2f%n", "Account balance - ", account.getBalance());

        System.out.println("________________________________________\n");

        cardAccount.putMoney(200);
        System.out.printf("%s %.2f%n", "CardAccount balance - ", cardAccount.getBalance());
        cardAccount.getMoney(60);
        System.out.printf("%s %.2f%n", "CardAccount balance - ", cardAccount.getBalance());
        cardAccount.send(account, 30);
        System.out.printf("%s %.2f%n", "CardAccount balance - ", cardAccount.getBalance());


        System.out.println("________________________________________\n");

        depositAccount.putMoney(300);
        System.out.printf("%s %.2f%n", "DepositAccount balance - ", depositAccount.getBalance());
        depositAccount.getMoney(50);
        System.out.printf("%s %.2f%n", "DepositAccount balance - ", depositAccount.getBalance());
        depositAccount.send(account, 80.5);
        System.out.printf("%s %.2f%n", "DepositAccount balance - ", depositAccount.getBalance());

        System.out.println("________________________________________\n");

        System.out.printf("%s %.2f%n", "Account balance - ", account.getBalance());
        System.out.printf("%s %.2f%n", "CardAccount balance - ", cardAccount.getBalance());
        System.out.printf("%s %.2f%n", "DepositAccount balance - ", depositAccount.getBalance());
    }
}
