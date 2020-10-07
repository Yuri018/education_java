package bankAccount2;

public class Loader {
    public static void main(String[] args) {
        Account account = new Account();
        account.putMoney(100);
        System.out.println("Account balance - " + account.getBalance());
        account.getMoney(101);
        System.out.println("Account balance - " + account.getBalance());

        System.out.println("________________________________________\n");

        CardAccount cardAccount = new CardAccount();
        cardAccount.putMoney(100);
        System.out.println("CardAccount balance - " + cardAccount.getBalance());
        cardAccount.getMoney(60);
        System.out.println("CardAccount balance - " + cardAccount.getBalance());

        System.out.println("________________________________________\n");

        DepositAccount depositAccount = new DepositAccount();
        depositAccount.putMoney(100);
        System.out.println("DepositAccount balance - " + depositAccount.getBalance());
        depositAccount.getMoney(50);
        System.out.println("DepositAccount balance - " + depositAccount.getBalance());
    }
}
