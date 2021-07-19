public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }
}
