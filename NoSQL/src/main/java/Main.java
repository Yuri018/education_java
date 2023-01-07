
public class Main {

    public static void main(String[] args) throws InterruptedException {
        RedisStorage redis = new RedisStorage();
        redis.init();
        for (int i = 0; i < 20; i++) {
            redis.addUser(i + 1);
        }
        while (true) {
            if (isPaid()) {
                String payingUser = payingPerson();
                redis.userPay(payingUser);
                System.out.println("> Пользователь " + payingUser + " оплатил платную услугу");
                Thread.sleep(1000);
            }
            log(Integer.parseInt(redis.getFirstUser()));
            redis.resetUsers(redis.getFirstUser());
        }
    }

    private static String payingPerson() {
        int id = (int) (20 * Math.random());
        if (id < 1) {
            return String.valueOf(1);
        }
        return String.valueOf(id);
    }

    private static void log(int userId) {
        System.out.println("- На главной странице показываем пользователя " + userId);
    }

    private static boolean isPaid() {
        return Math.random() < 0.1;
    }
}
