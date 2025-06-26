public class IsBipartiteGraph {
    public static void main(String[] args) {
        int[][] graph = {
            { 0, 1, 0, 0, 1 },
            { 1, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 0 },
            { 0, 0, 1, 0, 1 },
            { 1, 0, 0, 1, 0 }
        }; // Ciclo com 5 vértices (pentágono)

        System.out.println("Is the graph bipartite? " + isBipartite(graph));
    }
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = -1; // -1 means uncolored
        }

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) { // If the node is uncolored
                if (!bfs(graph, color, i)) {
                    return false; // If BFS returns false, the graph is not bipartite
                }
            }
        }
        return true; // All components are bipartite
    }
    private static boolean bfs(int[][] graph, int[] color, int start) {
        int n = graph.length;
        color[start] = 0; // Start coloring with color 0
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1) { // If there is an edge
                    if (color[i] == -1) { // If the neighbor is uncolored
                        color[i] = 1 - color[node]; // Color with opposite color
                        queue.add(i);
                    } else if (color[i] == color[node]) { // If the neighbor has the same color
                        return false; // Not bipartite
                    }
                }
            }
        }
        return true; // All neighbors are properly colored
    } 
}
