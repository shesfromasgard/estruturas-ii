import java.util.Scanner;

public class DegreeDirected {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int a = 0;
        int[][] matrix;
    
        a = sc.nextInt();
    
        matrix = new int[a][a];
    
        for(int i = 0; i < a; ++i)
            for (int j = 0; j < a; j++)
                matrix[i][j] = sc.nextInt();

        for(int i = 0; i < a; ++i) {
            int saida = 0;

            for(int j = 0; j < a; ++j)
                if(matrix[i][j] == 1)
                    saida++;

            int entrada = 0;

            for(int j = 0; j < a; ++j)
                if(matrix[j][i] == 1)
                    entrada++;

            System.out.println("Nó " + i + " tem grau de saída " + saida + " e grau de entrada " + entrada);
        }
    
        sc.close();
        
    }
}
