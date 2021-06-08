public class Main {

  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля," +
            " а Маша - 30000 рублей";
    calculateSalarySum(text);
  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    String regexpName = "^[A-ЯЁа-яё]+\\s";
    String regexpCount = "^[0-9]";
//    String[] name = text.split(regexpName);
//    for (String n: name){
//      System.out.println(n);
//      }
    String[] count = text.split(regexpCount);
      for (String c: count){
        System.out.println(c);
    }
    return -1;
  }

}