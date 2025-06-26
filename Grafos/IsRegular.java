import java.util.Scanner;

public class IsRegular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int a = 0;
        int[][] matrix;
    
        a = sc.nextInt();
    
        matrix = new int[a][a];
    
        for(int i = 0; i < a; ++i)
            for (int j = 0; j < a; j++)
                matrix[i][j] = sc.nextInt();


        int initialDegree = 0;

        for(int i = 0; i < a; ++i)
            if(matrix[0][i] == 1)
                initialDegree++;

        for(int i = 1; i < a; ++i){
            int degree = 0;
            for(int j = 0; j < a; ++j)
                if(matrix[i][j] == 1)
                    degree++;

            if(degree != initialDegree) {
                System.out.println("Not regular");
                System.exit(0);
            }
        }

        System.out.println("Regular");
    
        sc.close();
    }
    
}
