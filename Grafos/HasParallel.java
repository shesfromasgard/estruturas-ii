import java.util.Scanner;

public class HasParallel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int[][] matrix;

        a = sc.nextInt();

        matrix = new int[a][a];

        for(int i = 0; i < a; ++i) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] > 1) {
                    System.out.println("Has parallel paths.");
                    System.exit(0);
                }
            }
        }

        System.out.println("Has NO parallel paths.");

        sc.close();
    }
}
