import java.util.HashMap;
import java.util.Random;

public class Bank {
    private HashMap<String, Account> accounts;
    private final Random RANDOM = new Random();

    public Bank(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return RANDOM.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */
    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        Account fromAccount = accounts.get(fromAccountNum);
        Account toAccount = accounts.get(toAccountNum);

        try {

            if (fromAccount.isBlocked()) {
                System.out.println("Account " + fromAccount.getAccNumber() + " is blocked! Transfer denied!");
                return;
            }
            if (toAccount.isBlocked()) {
                System.out.println("Account " + toAccount.getAccNumber() + " is blocked! Transfer denied!");
                return;
            }
            synchronized (Integer.parseInt(fromAccount.getAccNumber()) < Integer.parseInt(toAccount.getAccNumber()) ?
                    fromAccount : toAccount) {
                synchronized (Integer.parseInt(fromAccount.getAccNumber()) > Integer.parseInt(toAccount.getAccNumber()) ?
                        fromAccount : toAccount) {
                    fromAccount.setMoney(fromAccount.getMoney() - amount);
                    toAccount.setMoney(toAccount.getMoney() + amount);

                    if (amount > 50000) {
                        boolean status = isFraud(fromAccountNum, toAccountNum, amount);
                        fromAccount.setBlocked(status);
                        toAccount.setBlocked(status);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        Account account = accounts.get(accountNum);
        return account.getMoney();
    }
}