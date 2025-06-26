import java.util.Scanner;

public class IsSimple {
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
                    System.out.println("It's NOT simple.");
                    System.exit(0);
                }
            }
            if(matrix[i][i] == 1) {
                System.out.println("It's NOT simple.");
                System.exit(0);
            }
        }

        System.out.println("It is simple.");

        sc.close();
    }
}
