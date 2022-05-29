import java.io.IOException;

public class Main {

    public static final String LINK = "https://skillbox-java.github.io/";
    public static final String PATH = "homework_11.5/src/main/resources/mosMetroMap.json";

    public static void main(String[] args) throws IOException {
        MetroParser metroParser = new MetroParser(LINK, PATH);

        try{
            metroParser.printResult();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
