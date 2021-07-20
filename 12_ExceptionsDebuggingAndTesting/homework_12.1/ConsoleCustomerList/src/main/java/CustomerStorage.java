import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

            String[] components = data.split("\\s+");
            if (components.length != 4) {
                throw new ArrayIndexOutOfBoundsException("Wrong format. Correct format: " +
                        "\nВасилий Петров vasily.petrov@gmail.com +79215637722");
            }
            if (!components[2].matches(".+@.+\\..+")) {
                throw new IllegalArgumentException("Wrong E-Mail.");
            }
            if (!components[3].matches("^\\+7\\d{10}$")) {
                throw new IllegalArgumentException("Wrong Phone number.");
            }
            String name = components[0] + " " + components[1];
            storage.put(name, new Customer(name, components[3], components[2]));

    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}