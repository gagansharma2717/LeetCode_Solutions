import java.util.*;

public class iterativeDFS {
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
        int src = scn.nextInt();

        boolean[] visited = new boolean[vtces];
        Stack<Pair> stk = new Stack<>();

        stk.push(new Pair(src, src + ""));

        while(stk.size()> 0 )
        {
            Pair rem = stk.pop();

            if(visited[rem.v] == true)
            {
                continue;
            }

            visited[rem.v] = true;

            System.out.println(rem.v + "@" + rem.psf);

            for (Edge edge : graph[rem.v]) {
                if(visited[edge.nbr] == false)
                {
                    stk.push(new Pair(edge.nbr, rem.psf + edge.nbr));
                }
            }
        }
    }

    static class Pair {
        int v;
        String psf;

        Pair(int v, String psf)
        {
            this.v = v;
            this.psf = psf;
        }
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
2
 */