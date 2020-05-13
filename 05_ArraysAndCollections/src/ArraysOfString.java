public class ArraysOfString {
    public static void main(String[] args) {
        String[] text = {"Hello", " Word!!!"};
        System.out.println(text[0] + " " + text[1]);

        for (String article: text
             ) {
            System.out.println(article);
        }

    }
}
