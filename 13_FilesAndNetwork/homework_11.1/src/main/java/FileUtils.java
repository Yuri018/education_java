import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileUtils {

    private static final Scanner scr = new Scanner(System.in);

    public static long calculateFolderSize() {
        System.out.println("Введите путь до папки:");
        String path = scr.nextLine();
        long size = 0;
        try {
            size = Files.walk(Path.of("path")).mapToLong(x -> x.toFile().length()).sum();
        }  catch (IOException ex) {
            System.out.println("Такого файла или папки не существует");
        }
        double sizeConvert = size / (1024.0 * 1024.0);
        System.out.printf("Размер папки " + path + " составляет " + "%.2f" + " Mb", sizeConvert);
        return size;
    }

}
