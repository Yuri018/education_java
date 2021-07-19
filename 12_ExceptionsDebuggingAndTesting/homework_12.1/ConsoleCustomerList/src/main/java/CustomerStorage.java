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

        try {
            String[] components = data.split("\\s+");
            if (components.length != 4) {
                throw new IllegalArgumentException("Wrong components");
//        }
//        if (!components[INDEX_PHONE].equals(validatePhone())) {
//            throw new IllegalArgumentException("Wrong phone");
//        }
//        if (!components[INDEX_EMAIL].equals(validateEmail())) {
//            throw new IllegalArgumentException("Wrong Email");
            } else {
                String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
                storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }

    }

    public String validatePhone() {
        String phone = "";
        String regex = ("^\\\\d{10}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return phone;
    }

    public String validateEmail() {
        String email = "";
        String regex = ("^([_a-zA-Z0-9-]+(\\\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]" +
                "+(\\\\.[a-zA-Z0-9-]+)*(\\\\.[a-zA-Z]{1,6}))?$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return email;
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