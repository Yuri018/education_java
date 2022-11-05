import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;

public class Main {
    private static final String URL = "https://lenta.ru/";
    private static final int COUNT_DEFAULT_SLASH = URL.length() - URL.replace("/", "").length();

    public static void main(String[] args) {
        ReferenceParser referenceParser = new ReferenceParser(URL);

        System.out.println("Начало парсинга в файл siteMap.txt");
        long startTime = System.currentTimeMillis();

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(referenceParser);
        referenceParser.getSortedSetLinks().stream()
                .map(Main::getStringWithTabs)
                .forEach(Main::writer);

        long endTime = System.currentTimeMillis();
        System.out.println("Время парсинга: " + (endTime - startTime) / 1000 + " сек.\n");
    }

    private static String getStringWithTabs(String line) {
        int countSlash = line.length() - line.replace("/", "").length();
        if (countSlash <= COUNT_DEFAULT_SLASH)
            return "".concat(line);

        return "\t".repeat(Math.max(0, countSlash - COUNT_DEFAULT_SLASH)).concat(line);
    }

    private static void writer(String line){
        try (FileWriter fileWriter = new FileWriter(
                "SitemapParser/src/main/resources/siteMap.txt", true)){
            fileWriter.write(line.concat("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
