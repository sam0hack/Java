import java.util.*;
import java.io.*;

 class Graph
{
     int Vertices;
    LinkedList<Integer> lst[];
    Graph(int v)
    {
        Vertices=v;
        lst=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            lst[i]=new LinkedList<Integer>();
        }
    }

    void add_edge(int u,int v)
    {
        lst[u].add(v);
    }

    void dfs_utils(int v,boolean visited[])
    {
        visited[v]=true;
        System.out.print(v+"->");

        Iterator<Integer> i=lst[v].listIterator();
        while(i.hasNext())
        {
            int n=i.next();
            if (!visited[n])
            {
                dfs_utils(n,visited);
            }
        }
    }

    void dfs(int v)
    {
        boolean visited[]=new boolean[Vertices];
        dfs_utils(v,visited);
    }

}

public class DFS
{
    public static  void main(String[]args)
    {
        Scanner S=new Scanner((System.in));
        System.out.println("no. of vertices");
        int v=S.nextInt();
        System.out.println("Enter the no. of edges");
        int edge=S.nextInt();

        Graph G=new Graph(v);
        for(int i=0;i<edge;i++)
        {
            G.add_edge(S.nextInt(),S.nextInt());
        }

        System.out.println("vertex for dfs");
        G.dfs(S.nextInt());
    }

}
