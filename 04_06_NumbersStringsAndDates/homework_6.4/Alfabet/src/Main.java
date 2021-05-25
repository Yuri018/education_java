public class Main {
    public static void main(String[] args) {
        String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String alphabetWithoutSpaces = alphabet.replaceAll("\\s", "");

        for (int i = 0; i < alphabetWithoutSpaces.length(); i++) {
            int code = alphabetWithoutSpaces.charAt(i);
            System.out.print("letter: " + alphabetWithoutSpaces.charAt(i) + " ");
            System.out.println("Code " + code);
        }
    }
}


