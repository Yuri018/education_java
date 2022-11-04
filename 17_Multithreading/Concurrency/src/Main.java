import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            executor.shutdownNow();
        });

        ThreadPoolExecutor executors =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        executors.getPoolSize();
    }
}
