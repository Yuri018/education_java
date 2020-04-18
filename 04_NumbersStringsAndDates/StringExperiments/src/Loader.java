
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        printWithIndexes(text);

        String index1 = text.substring(text.indexOf("л") + 2, text.indexOf(" руб"));
        String index2 = text.substring(text.indexOf("-") + 2 , text.indexOf(" руб",23));
        String index3 = text.substring(text.lastIndexOf("-") + 2, text.lastIndexOf(" руб"));
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        int vasya = Integer.parseInt(index1);
        int petya = Integer.parseInt(index2);
        int macha = Integer.parseInt(index3);
        int sum = vasya + petya + macha;
        System.out.println("vasya " + "petya " + " and macha " + "count " + sum);
    }
    private static void printWithIndexes(String string) {
        StringBuilder letters = new StringBuilder().append("char: ");
        StringBuilder indexes = new StringBuilder().append("index:");
        for (int i = 0; i < string.length(); i++) {
            letters.append(String.format("%3s", string.charAt(i)));
            indexes.append(String.format("%3d", i));
        }
        System.out.println(letters);
        System.out.println(indexes.append(System.lineSeparator()));
    }
}