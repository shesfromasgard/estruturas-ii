public class IsIsomorphic {
    public static void main(String[] args) {
        int[][] g1 = {
                { 0, 1, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0 }
        }; // Ciclo fechado entre os vértices

        int[][] g2 = {
                { 0, 1 },
                { 1, 0 }
        }; // Árvore simples (linha com dois nós)

        System.out.println("Isomorphic: " + isomorphic(g1, g2));
    }

    public static boolean isomorphic(int[][] g1, int[][] g2) {
        if (g1.length != g2.length) {
            return false; // Diferentes números de vértices
        }

        int n = g1.length;
        boolean[] visited = new boolean[n];
        return dfs(g1, g2, visited, 0);
    }
    private static boolean dfs(int[][] g1, int[][] g2, boolean[] visited, int current) {
        if (current == g1.length) {
            return true; // Todos os vértices foram visitados
        }

        for (int i = 0; i < g2.length; i++) {
            if (!visited[i] && isCompatible(g1, g2, current, i)) {
                visited[i] = true;
                if (dfs(g1, g2, visited, current + 1)) {
                    return true;
                }
                visited[i] = false; // Backtrack
            }
        }
        return false;
    }
    private static boolean isCompatible(int[][] g1, int[][] g2, int v1, int v2) {
        for (int i = 0; i < g1.length; i++) {
            if (g1[v1][i] != g2[v2][i]) {
                return false; // As adjacências não coincidem
            }
        }
        return true; // As adjacências coincidem
    }
}
