import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CarNumberGenerator implements Runnable {

    PrintWriter writer;
    public StringBuilder builder;
    public int regionCode;

    public CarNumberGenerator(int regionCode) throws FileNotFoundException {
        writer = new PrintWriter("res/number" + regionCode + ".txt");
        builder = new StringBuilder();
        this.regionCode = regionCode;
    }

    @Override
    public void run() {

        for (int number = 1; number < 1000; number++) {
            for (char firstLetter : Loader.letters) {
                for (char secondLetter : Loader.letters) {
                    for (char thirdLetter : Loader.letters) {

                        builder.append(firstLetter)
                                .append(padNumber(number, 3))
                                .append(secondLetter)
                                .append(thirdLetter)
                                .append(padNumber(regionCode, 2))
                                .append(System.lineSeparator());
                    }
                }
            }
        }
        writer.write(builder.toString());
        writer.flush();
        writer.close();
    }

    private static String padNumber(int number, int numberLength) {
        StringBuilder numberStr = new StringBuilder(Integer.toString(number));
        int padSize = numberLength - numberStr.length();

        for (int i = 0; i < padSize; i++) {
            numberStr.append(0);
        }
        return numberStr.toString();
    }
}
