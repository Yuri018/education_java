public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String profit1 = text.substring(text.indexOf("ал") + 3, text.indexOf(" руб"));
        String profit2 = text.substring(text.indexOf("-") + 2, text.lastIndexOf(",") - 6);
        String profit3 = text.substring(text.lastIndexOf("-") + 2, text.lastIndexOf(" руб"));

        int sum = Integer.parseInt(profit1) + Integer.parseInt(profit2)
                + Integer.parseInt(profit3);

        System.out.println(sum);

    }

}