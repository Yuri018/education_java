public class ArrayX {
    public static void main(String[] args) {
        int n = 6;
        String[][] letterX = new String[n][n];
        for (int i = 0; i < letterX.length; i++) {
            for (int j = 0; j < letterX[i].length; j++) {
//                letterX[j][(n - 1) - j] = "x";
                if (i == j || i + j == n - 1){
                    letterX[i][j] = "x";
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
