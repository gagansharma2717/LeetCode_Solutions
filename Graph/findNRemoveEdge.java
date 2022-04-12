import java.util.*;
public class findNRemoveEdge {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int vtces = scn.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = scn.nextInt();
        for (int i = 0; i < edges; i++) {
            int v1 = scn.nextInt();
            int v2 = scn.nextInt();
            int wt = scn.nextInt();

            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

       
        display(graph);

        System.out.println("-------------Finding Edge----------");
        int idx = findEdge(graph, 4, 6);
        System.out.println(idx);

        System.out.println("--------After Edge Removal----------");
        removeEdge(graph, 4, 6);
        display(graph);
    }
    
    public static void display(ArrayList<Edge>[] graph)
    {
        int size = graph.length;

        for(int i = 0 ; i < size; i++)
        {
            System.out.print(i + "--->");
            for(Edge e : graph[i])
            {
                System.out.print("[" + e.src + "," + e.nbr + "," + e.wt + "]");
            }
            System.out.println();
        }

    }

    public static int findEdge(ArrayList<Edge>[] graph,int src, int dest)
    {
       for(int i = 0 ; i < graph[src].size(); i++)
       {
           Edge edge = graph[src].get(i);

           if (edge.nbr == dest) {
               return i;
           }
       }
       
       return -1;
    }

    public static void removeEdge(ArrayList<Edge>[] graph,int src, int dest){
        int idx = findEdge(graph, 4, 6);
        graph[src].remove(idx);

        int idx2 = findEdge(graph, 6, 4);
        graph[dest].remove(idx2);
    }
    
}

/* 
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
*/