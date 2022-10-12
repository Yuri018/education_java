package Variant2;

import java.util.HashMap;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void setAccounts(HashMap<String, Account> accounts) {
        this.accounts = accounts;
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
//        return random.nextBoolean();
        if (accounts.get(fromAccountNum).getIsFraued() || accounts.get(toAccountNum).getIsFraued()) {
            return true;
        } else return amount > 50000;
    }

    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        if (isFraud(fromAccountNum, toAccountNum, amount)) {  //блокировка акк-та если проверка не пройдена
            accounts.get(fromAccountNum).setIsFrauded();
            accounts.get(toAccountNum).setIsFrauded();

        } else {
            Account fromAccount = accounts.get(fromAccountNum);
            Account toAccount = accounts.get(toAccountNum);
            synchronized (fromAccount.compareTo(toAccount) > 0 ? fromAccount : toAccount) {
                synchronized (fromAccount.compareTo(toAccount) > 0 ? toAccount : fromAccount) {
                    if (fromAccount.getMoney() < amount) {
                        fromAccount.takeMoney(amount);
                        toAccount.putMoney(amount);
                    }
                }
            }
        }
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {
        synchronized (accounts.get(accountNum)) {
            return accounts.get(accountNum).getMoney();
        }

    }
}
