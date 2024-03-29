import java.io.PrintWriter;

public class Loader {
    public static char[] letters = {'У', 'К', 'Е', 'Н', 'Х', 'В', 'А', 'Р', 'О', 'С', 'М', 'Т'};

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();


        //for one thread
        PrintWriter writer = new PrintWriter("res/numbers.txt");

        for (int regionCode = 1; regionCode < 50; regionCode++) {
            StringBuilder builder = new StringBuilder();
            for (int number = 1; number < 1000; number++) {

                for (char firstLetter : letters) {
                    for (char secondLetter : letters) {
                        for (char thirdLetter : letters) {

                            builder.append(firstLetter)
                                    .append(padNumber(number,3))
                                    .append(secondLetter)
                                    .append(thirdLetter)
                                    .append(padNumber(regionCode, 2))
                                    .append(System.lineSeparator());
                        }
                    }
                }
            }
            writer.write(builder.toString());
        }
        writer.flush();
        writer.close();

        System.out.println("Время записи одного файла из одиного потока: "
                + (System.currentTimeMillis() - start) + " ms");

        //for multiple threads
        long startThreads = System.currentTimeMillis();

        MultiLoader loader = new MultiLoader();
        loader.loadCarNumber();

        System.out.println("Время записи в несколько файлов из нескольких потоков: "
                + (System.currentTimeMillis() - startThreads) + " ms");
    }

    private static String padNumber(int number, int numberLength) {
        String numberStr = Integer.toString(number);
        int padSize = numberLength - numberStr.length();

        for (int i = 0; i < padSize; i++) {
            numberStr = '0' + numberStr;
        }
        return numberStr;
    }

}
