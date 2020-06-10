public class ArrayX {
    public static void main(String[] args) {
        int n = 5;
        String[][] letterX = new String[n][n];
        for (int i = 0; i < letterX.length; i++) {
            for (int j = 0; j < letterX.length; j++) {
//                    letterX[i][(n - 1) - i] = "x";
                if (i == j){
                    letterX[i][i] = "x";
                    letterX[i][(n - 1) - i] = "x";

                }
                else letterX[i][j] = " ";
            }
        }
        for (String[] x : letterX) {
            for (String s : x) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
