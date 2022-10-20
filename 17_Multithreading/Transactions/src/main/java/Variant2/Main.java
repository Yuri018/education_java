package Variant2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static final int THREAD_COUNT = 20;

    public static void main(String[] args) throws InterruptedException {

        HashMap<String, Account> accounts = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            String accNumber = String.valueOf(i);
            long money = Math.round(100000 * Math.random());
            Account acc = new Account();
            acc.setAccNumber(accNumber);
            acc.setMoney(money);
            accounts.put(accNumber, acc);
        }

        Bank bank = new Bank(accounts);

        long beforeBalance = 0;
        for (int i = 1; i <= accounts.size(); i++) {
            beforeBalance += bank.getBalance(String.valueOf(i));
        }
        System.out.println("Банковский баланс до переводов: " + beforeBalance + " руб.");

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads.add(new Thread(() -> {
//                int anyNumber = (int) Math.round(99 * Math.random());
                String fromAccount = String.valueOf((int) Math.round(99 * Math.random()));
                String toAccount = String.valueOf((int) Math.round(99 * Math.random()));
                long amount = (long) (100000 * Math.random());
                bank.transfer(fromAccount, toAccount,amount);
            }));
        }
        threads.forEach(Thread::start);
        for (Thread t : threads) {
            t.join();
        }
        long afterBalance = 0;
        for (int n = 1; n <= accounts.size(); n++) {
            afterBalance += bank.getBalance(String.valueOf(n));
        }
        System.out.println("Банковский баланс после переводов: " + afterBalance + " руб.");
    }
}