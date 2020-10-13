package bankingService;

public class Main {
    public static void main(String[] args) {
        Client naturalPerson = new NaturalPerson();
        Client legalEntity = new LegalEntity();
        Client entrepreneur = new Entrepreneur();

        naturalPerson.clientInfo();
        naturalPerson.putMoney(250);
        System.out.printf("%s %.3f%n", "naturalPerson balance - ", naturalPerson.getBalance());
        naturalPerson.getMoney(335);
        System.out.printf("%s %.3f%n", "naturalPerson balance - ", naturalPerson.getBalance());

        System.out.println("________________________________________\n");

        legalEntity.clientInfo();
        legalEntity.putMoney(800);
        System.out.printf("%s %.3f%n", "legalEntity balance - ", legalEntity.getBalance());
        legalEntity.getMoney(1850);
        System.out.printf("%s %.3f%n", "legalEntity balance - ", legalEntity.getBalance());
        legalEntity.getMoney(1328);
        System.out.printf("%s %.3f%n", "legalEntity balance - ", legalEntity.getBalance());

        System.out.println("________________________________________\n");

        entrepreneur.clientInfo();
        entrepreneur.putMoney(900);
        System.out.printf("%s %.3f%n", "entrepreneur balance - ", entrepreneur.getBalance());
        entrepreneur.putMoney(1000);
        System.out.printf("%s %.3f%n", "entrepreneur balance - ", entrepreneur.getBalance());
        entrepreneur.getMoney(750);
        System.out.printf("%s %.3f%n", "entrepreneur balance - ", entrepreneur.getBalance());
    }
}
