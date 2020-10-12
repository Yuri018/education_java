package bankingService;

public class Main {
    public static void main(String[] args) {
        Client naturalPerson = new NaturalPerson();
        naturalPerson.putMoney(250);
        System.out.printf("%s %.2f%n", "naturalPerson balance - ", naturalPerson.getBalance());
        naturalPerson.getMoney(335);
        System.out.printf("%s %.2f%n", "naturalPerson balance - ", naturalPerson.getBalance());

    }
}
