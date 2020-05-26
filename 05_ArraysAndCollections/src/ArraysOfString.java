public class ArraysOfString {
    public static void main(String[] args) {
        String[] text = {"Hello", " Word!!!"};
        System.out.println(text[0] + " " + text[1]);

        for (String article: text) {
            System.out.print(article);
        }
        System.out.println();
// цикл для перебора элементов массива в обратном порядке
        for (int i = text.length - 1; i >=0; i-- ){
            System.out.println(text[i]);
        }

    }
}
