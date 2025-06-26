import java.util.Scanner;

public class HasCycle {

    static int[][] matriz = {
                { 0, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 }
        };

        static int[][] matriz2 = {
                { 0, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 1 },
                { 1, 0, 1, 0 }
        };

        static int[][] matriz3 = {
                { 0, 1, 0, 0 },
                { 1, 0, 0, 0 },
                { 0, 0, 0, 1 },
                { 0, 0, 1, 0 }
        };
        static int[][] g1 = {
                { 0, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 0 }
        }; // Triângulo (ciclo)

        static int[][] g2 = {
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 }
        }; // Quadrado (4 vértices em ciclo)

        static int[][] g3 = {
                { 0, 1, 1, 0 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 }
        }; // Ciclo com 4 vértices + ligações extras

        static int[][] g4 = {
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1 },
                { 1, 0, 0, 1, 0 }
        }; // Ciclo com 5 vértices (pentágono)

        static int[][] g5 = {
                { 0, 1, 1, 0 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 }
        }; // 4 vértices fortemente conectados (ciclo garantido)

        static int[][] g6 = {
                { 0, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 0 },
                { 1, 0, 0, 1, 1 },
                { 0, 1, 1, 0, 1 },
                { 0, 0, 1, 1, 0 }
        }; // Vários ciclos sobrepostos

        static int[][] g7 = {
                 { 0, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 1 },
                { 1, 0, 1, 0 }
        }; 

        static int[][] g8 = {
                { 0, 1, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0 }
        }; // Hexágono (ciclo com 6 vértices)

        int[][] g9 = {
                { 0, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 0 }
        }; // Dois triângulos conectados por um vértice comum

        int[][] g10 = {
                { 0, 1, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0 }
        }; // Ciclo fechado entre 0-1-2-3-4-5-0

        int[][] t1 = {
                { 0, 1 },
                { 1, 0 }
        }; // Árvore simples (linha com 2 nós)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int a;
        int[][] matrix;

        matrix = matriz;
        a = matrix.length;

        boolean[] visited = new boolean[a];
        boolean hasCycle = false;
        
        for (int i = 0; i < a; i++) {
            if (!visited[i]) {
                if (dfs(matrix, visited, i, -1)) {
                    hasCycle = true;
                    break;
                }
            }
        }
        System.out.println(hasCycle ? "YES" : "NO");


        sc.close();
    }
    private static boolean dfs(int[][] matrix, boolean[] visited, int current, int parent) {
        visited[current] = true;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[current][i] == 1) {
                if (!visited[i]) {
                    if (dfs(matrix, visited, i, current)) {
                        return true;
                    }
                } else if (i != parent) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
