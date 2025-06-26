import java.util.Scanner;

public class DegreeNotDirected {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int a = 0;
        int[][] matrix;
    
        a = sc.nextInt();
    
        matrix = new int[a][a];
    
        for(int i = 0; i < a; ++i) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1)
                    sum++;
            }
            System.out.println("Vértice " + i + " tem grau " + sum);
        }

    
        sc.close();
        
    }
    
}
