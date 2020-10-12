package bankingService;

public class Main {
    public static void main(String[] args) {
        Client naturalPerson = new NaturalPerson();
        naturalPerson.putMoney(250);
        System.out.printf("%s %.2f%n", "naturalPerson balance - ", naturalPerson.getBalance());
        naturalPerson.getMoney(335);
        System.out.printf("%s %.2f%n", "naturalPerson balance - ", naturalPerson.getBalance());

        System.out.println("________________________________________\n");

        Client legalEntity = new LegalEntity();
        legalEntity.putMoney(800);
        System.out.printf("%s %.2f%n", "legalEntity balance - ", legalEntity.getBalance());
        legalEntity.getMoney(1850);
        System.out.printf("%s %.2f%n", "legalEntity balance - ", legalEntity.getBalance());


    }
}
