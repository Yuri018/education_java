public class Main {
    public static void main(String[] args) {
        int age1 = 25;
        int age2 = 30;
        int age3 = 20;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (age1 < age2 && age2 < age3) {
            min = age1;
            middle = age2;
            max = age3;
        } else if (age1 > age2 && age2 > age3) {
            min = age3;
            middle = age2;
            max = age1;
        } else if (age1 < age2 && age2 > age3) {
            min = age3;
            middle = age1;
            max = age2;
        } else if (age1 > age2 && age2 < age3) {
            min = age2;
            middle = age1;
            max = age3;
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);


    }
}
