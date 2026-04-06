import java.util.ArrayList;

public class WeightGraph {
    
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1,3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        for(int j=0; j<graph.length; j++) {
            System.out.print(j+" : ");
            for(int i=0; i<graph[j].size(); i++) {
                Edge e = graph[j].get(i);
                System.out.print(e.dest+" (" + e.wt+ ") ");
            }
            System.out.println();
        }
    }
}
