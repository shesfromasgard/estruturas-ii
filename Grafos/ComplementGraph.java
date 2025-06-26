public class ComplementGraph {
    static int[][] matrix2 = {
            { 0, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 0, 0 },
            { 0, 1, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 1 },
            { 1, 0, 0, 0, 1, 0 }
    };
    public static void main(String[] args) {
        int[][] matrix = matrix2;
        int a = matrix.length;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print((matrix[i][j] == 1 ? "0 " : "1 "));
                }
            }
            System.out.println();
        }
    }
}
