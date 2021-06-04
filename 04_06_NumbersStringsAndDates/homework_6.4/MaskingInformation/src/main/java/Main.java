public class Main {

    public static void main(String[] args) {
//        searchAndReplaceDiamonds("Номер кредитной карты <4008> 1234 <5678> 8912", "***");
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений

        StringBuilder textPlaceholder = new StringBuilder(text);

        while (textPlaceholder.indexOf("<") != -1 && textPlaceholder.indexOf(">") != -1) {
            int textInDiamondOpen = textPlaceholder.indexOf("<");
            int textInDiamondClose = textPlaceholder.indexOf(">");

            textPlaceholder.replace(textInDiamondOpen, textInDiamondClose + 1, placeholder);
        }
        System.out.println(textPlaceholder);
        return textPlaceholder.toString();
    }
}