public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 197452478;

        System.out.println("Сумма символов = " + sumDigits(container.count));

    }

    public static int sumDigits(Integer number) {
        String intToStr = number.toString(); // переводим Integer в String
        int numberOfCharacter = intToStr.length();//считаем количество символов
        // строки методом length() и возвращаем в виде int
        System.out.println("Количество символов = " + numberOfCharacter);

        int sum = 0;
        for (int i = 0; i < numberOfCharacter; i++) {
        //метод character.getNumericValue (char ch) для преобразования символа в int
            sum += Character.getNumericValue(intToStr.charAt(i));
        }
        //@TODO: write code here
        return sum;
    }
}

