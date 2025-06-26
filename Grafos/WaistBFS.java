public class WaistBFS {
    public static void main(String[] args) {
        int[][] g1 = {
                { 0, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 0, 1, 0 },
                { 0, 0, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0 }
        };
        System.out.println("Waist: " + waist(g1));
    }

    public static int waist(int[][] g) {
        int n = g.length;
        int minCycle = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            int[] dist = new int[n];
            int[] parent = new int[n];
            java.util.Arrays.fill(dist, -1);
            java.util.Arrays.fill(parent, -1);
            java.util.Queue<Integer> q = new java.util.LinkedList<>();
            q.add(start);
            dist[start] = 0;

            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v = 0; v < n; v++) {
                    if (g[u][v] == 1) {
                        if (dist[v] == -1) {
                            dist[v] = dist[u] + 1;
                            parent[v] = u;
                            q.add(v);
                        } else if (parent[u] != v) {
                            // Encontrou ciclo
                            minCycle = Math.min(minCycle, dist[u] + dist[v] + 1);
                        }
                    }
                }
            }
        }
        return (minCycle == Integer.MAX_VALUE) ? -1 : minCycle;
    }
}