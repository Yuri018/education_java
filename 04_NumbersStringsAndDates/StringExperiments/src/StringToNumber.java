public class StringToNumber {
    public static void main(String[] args) {
        String string = "45364";
        int intNumber = Integer.parseInt(string);//преобразуем в int (в число)
        System.out.println(intNumber);
        String stringNumber = Integer.toString(intNumber);//преобразуем обратно в String (через Integer)
        System.out.println(stringNumber);

    }

}
