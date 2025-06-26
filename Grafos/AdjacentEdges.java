import java.util.Scanner;

public class AdjacentEdges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int[][] matrix;

        a = sc.nextInt();

        matrix = new int[a][a];

        for(int i = 0; i < a; ++i)
            for (int j = 0; j < a; j++)
                matrix[i][j] = sc.nextInt();

        int pos = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < a; ++i)
            if(matrix[pos][i] == 1)
                sum++;

        System.out.println(pos + " has " + sum + " adjacent edges.");

        sc.close();
    }
}
