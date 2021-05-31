public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    int vasyaProfit = Integer.parseInt
            (text.substring(text.indexOf("л ") + 2, text.indexOf(" р")));
    int petyaProfit = Integer.parseInt
            (text.substring(text.indexOf("- ") + 2, text.indexOf(" рубля")));
    int machaProfit = Integer.parseInt
            (text.substring(text.indexOf("а - ") + 4, text.lastIndexOf(" рублей")));
    int sum = vasyaProfit + petyaProfit + machaProfit;
    System.out.println(sum);
  }
}