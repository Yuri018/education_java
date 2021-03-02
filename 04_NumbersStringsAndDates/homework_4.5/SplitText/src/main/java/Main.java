
public class Main {

    public static void main(String[] args) {

    }

    public static String splitTextIntoWords(String text) {

        String[] words = text.replaceAll("\\d", "").split("\\s*(\\s|,|;|-|!|\\.)\\s*");
        //методом replaceAll заменяем ненужные строки, методом split убираем ненужные символы
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i != words.length - 1) {
                word.append(words[i]).append("\r\n");
            } else
                word.append(words[i]);
        }
        return word.toString();
    }

}