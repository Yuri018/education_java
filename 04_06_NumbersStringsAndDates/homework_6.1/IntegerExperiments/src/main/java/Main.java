public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        int sum = sumDigits(7843);

        System.out.println(sum);
    }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода
   */

    public static int sumDigits(Integer number) {
        //@TODO: write code here and delete TODO line
        if (number != null) {
            String integerToString = Integer.toString(number);// переводим Integer в String
            int sum = 0;
            for (int i = 0; i < integerToString.length(); i++) { //считаем количество символов
                sum += Character.getNumericValue(integerToString.charAt(i)); //и возвращаем в виде int
            }
            return sum;
        }
        return -1;
    }
}
