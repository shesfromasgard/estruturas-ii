public class NumberofComponents {
    public static void main(String[] args) {
        int[][] matrix2 = {
                { 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0 }
        };

        System.out.println("Number of components: " + countComponents(matrix2));
    }
    public static int countComponents(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int componentCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                componentCount++;
            }
        }
        return componentCount;
    }
    private static void dfs(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }
}
