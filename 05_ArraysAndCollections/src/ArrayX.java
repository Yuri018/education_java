public class ArrayX {
    public static void main(String[] args) {
        int n = 5;
        String[][] letterX = new String[n][n];
        for (int i = 0; i < letterX.length; i++) {
            for (int j = 0; j < letterX.length; j++) {
                letterX[i][i] = "x";
                letterX[i][(n - 1) - j] = " ";
                if (i == j){
                    letterX[i][j] = "x";
                    letterX[i][n - 1 - j] = "x";
                }
            }
        }
        for (int i = 0; i < letterX.length; i++) {
            for (int j = 0; j < letterX[i].length; j++) {
                System.out.print(letterX[i][j] + " ");
            }
            System.out.println();
        }
    }
}
