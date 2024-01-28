package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
        static class Edge {
            int src;
            int des;

            Edge(int src, int des) {
                this.src = src;
                this.des = des;
            }
        }


        public static void createGraph(ArrayList<Edge> graph[])
        {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0, 1));
            graph[1].add(new Edge(1, 2));

            graph[1].add(new Edge(1, 0));
            graph[2].add(new Edge(2, 3));

            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 4));

            graph[3].add(new Edge(3, 1));
            graph[3].add(new Edge(3, 4));
            graph[3].add(new Edge(3, 5));

            graph[4].add(new Edge(3, 2));
            graph[4].add(new Edge(3, 3));
            graph[4].add(new Edge(3, 5));

            graph[5].add(new Edge(3, 3));
            graph[5].add(new Edge(3, 4));
            graph[5].add(new Edge(3, 6));

            graph[5].add(new Edge(6, 5));

        }
        public static void bfsTravers(ArrayList<Edge> graph[],int V)
        {
            Queue<Integer> q= new LinkedList<>();
            boolean visited[]= new boolean[V];
            q.add(0);

            while(!q.isEmpty())
            {
                int curr=q.remove();
               if(visited[curr]==false)
               {
                   System.out.print(curr+" ");
                   visited[curr]=true;

                   for(int i=0;i<graph[curr].size();i++)
                   {
                     Edge e=graph[curr].get(i);
                     q.add(e.des);
                   }
               }
            }
        }

        public static void main(String[] args) {
            int v = 7;


            // Graph:
//         1 ___ 3
//        /       | \
//       0        |  5 -- 6
//        \       | /
//          2 ___ 4

            ArrayList<Edge> graph[] = new ArrayList[v];
            createGraph(graph);
            bfsTravers(graph,v);
            //System.out.println();
        }

}
