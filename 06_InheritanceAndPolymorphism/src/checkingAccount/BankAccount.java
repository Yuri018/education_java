package checkingAccount;

import java.util.Scanner;

//создаем класс. В нем создаем методы снятия со счета (без комиссии),
//внесения на счет (без комиссии), просмотра остатка на счете
public class BankAccount {

    //поле класса BankAccount
    private double balance;

    //конструктор класса BankAccount
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }

    //геттер для приватного поля класса BankAccount
    public double getBalance() {
        return balance;
    }

    //сеттер для приватного поля класса BankAccount
    public void setBalance(double balance) {
        this.balance = balance;
    }

    Scanner scanner = new Scanner(System.in);

    //метод снятия со счета
    public double getMoney(double amount) {
        System.out.println("Введите сумму для снятия: ");
        amount = scanner.nextDouble();
        if (balance - amount < 0) {
            System.out.println("Недостаточно средств на счете");
        } else {
            balance -= amount;
            System.out.println("Снятие со счета - " + amount);
        }
        return amount;
    }

    //метод пополнения счета
    public void putMoney() {
        System.out.println("Введите сумму пополнения:");
        double amount = scanner.nextDouble();
        balance += amount;
    }

    //метод вывода баланса на печать
    public void balance() {
        System.out.println("Баланс простого счета - " + getBalance());
    }
}

