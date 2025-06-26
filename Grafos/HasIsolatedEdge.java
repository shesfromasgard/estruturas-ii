public class HasIsolatedEdge {
    
    private static  int[][] matrix2 = {
            { 0, 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 0, 0 },
            { 0, 1, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 1 },
            { 1, 0, 0, 0, 1, 0 }
    }; // Ciclo fechado entre 0-1-2-3-4-5-
    public static void main(String[] args) {

        int matrix[][] = matrix2;
        int a = matrix.length;

        for(int i = 0; i < a; i++) {
            boolean hasIsolatedEdge = true;
            for(int j = 0; j < a; j++) {
                if(matrix[i][j] == 1) {
                    hasIsolatedEdge = false;
                    break;
                }
            }
            if(hasIsolatedEdge) {
                System.out.println("Has isolated edge");
                System.exit(0);
            }
        }

        System.out.println("Has NO isolated edge");
        
    }
}
