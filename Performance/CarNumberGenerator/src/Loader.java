import java.io.FileOutputStream;

public class Loader {
    public static char[] letters = {'У', 'К', 'Е', 'Н', 'Х', 'В', 'А', 'Р', 'О', 'С', 'М', 'Т'};

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();


        //for one thread
        FileOutputStream writer = new FileOutputStream("CarNumberGenerator/res/numbers.txt");

        for (int regionCode = 1; regionCode < 200; regionCode++) {

            StringBuilder builder = new StringBuilder();
            for (int number = 1; number < 1000; number++) {

                for (char firstLetter : letters) {
                    for (char secondLetter : letters) {
                        for (char thirdLetter : letters) {

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
            writer.write(builder.toString().getBytes());
        }
        writer.close();

        System.out.println("Время выполнения программы одним потоком: "
                + (System.currentTimeMillis() - start) + " ms");

        //for multiple threads
        long startThreads = System.currentTimeMillis();

        CarNumberLoader loader = new CarNumberLoader();
        loader.loadCarNumber();

        System.out.println("Время выполнения программы несколькими потоками: "
                + (System.currentTimeMillis() - startThreads) + " ms");
    }


    private static String padNumber(int number, int numberLength) {
        StringBuilder numberStr = new StringBuilder(Integer.toString(number));
        int padSize = numberLength - numberStr.length();

        for (int i = 0; i < padSize; i++) {
            numberStr.insert(0, '0');
        }

        return numberStr.toString();
    }
}
