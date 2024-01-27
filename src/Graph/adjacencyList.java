package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class adjacencyList {
    static class Edge
    {
        int src;
        int des;
        Edge(int src,int des)
        {
            this.src=src;
            this.des=des;
        }
    }
   public static void createGraph(ArrayList<Edge> graph[])
   {
            for(int i=0;i<graph.length;i++) {
                graph[i] = new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0,2));

            graph[1].add(new Edge(1,2));
            graph[1].add(new Edge(1,3));

            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,1));
            graph[2].add(new Edge(2,3));

            graph[3].add(new Edge(3,1));
            graph[3].add(new Edge(3,2));


   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter number of vertices:");
//        int v=sc.nextInt();
        int v=4;
        ArrayList<Edge> graph[]= new ArrayList[v];
        createGraph(graph);

        /// print 2's neighbours
        System.out.println("Nerighbour nodes are:");
        for(int i=0;i<graph[1].size();i++)
        {
          Edge e= graph[1].get(i);
            System.out.println(e.des+" ");
        }

        System.out.println("All edges list in given graph:");
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].size();j++)
            {
                Edge e=graph[i].get(j);
                System.out.println("edge:"+"{"+e.src+","+e.des+"}");
            }
        }
    }
}
