import java.util.Scanner;

public class IsComplete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int a = 0;
        int[][] matrix;
    
        a = sc.nextInt();
    
        matrix = new int[a][a];
    
        for(int i = 0; i < a; ++i)
            for (int j = 0; j < a; j++)
                matrix[i][j] = sc.nextInt();

        for(int i = 0; i < a; ++i)
            for(int j = i + 1; j < a; ++j)
                if(matrix[i][j] == 0 && i != j) {
                    System.out.println("Not complete");
                    System.exit(0);
                }

        System.out.println("Complete");
    
        sc.close();
    }
    
}
