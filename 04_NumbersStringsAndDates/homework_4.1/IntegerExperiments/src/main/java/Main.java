public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count = null;

    int sum = sumDigits(123456789);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    if (number == null){
      return -1;
    }
    String intToStr = Integer.toString(number);
    int numberOfCharacter = intToStr.length();
    int sum = 0;
    for (int i = 0; i < numberOfCharacter; i++){
      sum += Character.getNumericValue(intToStr.charAt(i));
    }
    return sum;
  }
}

