package bankingService;

public class Main {
    public static void main(String[] args) {
        Client naturalPerson = new NaturalPerson();
        Client legalEntity = new LegalEntity();
        Client entrepreneur = new Entrepreneur();

        naturalPerson.clientInfo();
        naturalPerson.putMoney(250);
        System.out.printf("%s %.3f %s %n", "naturalPerson balance - ", naturalPerson.getBalance(), "\u20bd");
        naturalPerson.getMoney(335);
        System.out.printf("%s %.3f %s %n", "naturalPerson balance - ", naturalPerson.getBalance(), "\u20bd");

        System.out.println("________________________________________\n");

        legalEntity.clientInfo();
        legalEntity.putMoney(800);
        System.out.printf("%s %.3f %s %n", "legalEntity balance - ", legalEntity.getBalance(), "\u20bd");
        legalEntity.getMoney(1850);
        System.out.printf("%s %.3f %s %n", "legalEntity balance - ", legalEntity.getBalance(), "\u20bd");
        legalEntity.getMoney(1328);
        System.out.printf("%s %.3f %s %n", "legalEntity balance - ", legalEntity.getBalance(), "\u20bd");

        System.out.println("________________________________________\n");

        entrepreneur.clientInfo();
        entrepreneur.putMoney(900);
        System.out.printf("%s %.3f %s %n", "entrepreneur balance - ", entrepreneur.getBalance(), "\u20bd");
        entrepreneur.putMoney(1000);
        System.out.printf("%s %.3f %s %n", "entrepreneur balance - ", entrepreneur.getBalance(), "\u20bd");
        entrepreneur.getMoney(750);
        System.out.printf("%s %.3f %s %n", "entrepreneur balance - ", entrepreneur.getBalance(), "\u20bd");
    }
}
