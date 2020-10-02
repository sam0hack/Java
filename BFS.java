import java.util.*;
import java.io.*;
class BFS
{
    private int vertices;
    private LinkedList<Integer>adjacency[];

    BFS(int v)
    {
      vertices=v;
      adjacency =new LinkedList[v];
      for(int i=0;i<v;i++)
      {
        adjacency[i]=new LinkedList();
      }
    }

    void add_Edge(int v,int w)
    {
      adjacency[v].add(w);
    }

    void Traversal(int s)
    {
      boolean visited[]=new boolean[vertices];
      LinkedList<Integer>queue=new LinkedList<Integer>();
      visited[s]=true;
      queue.add(s);
      while(queue.size()!=0)
      {
        s=queue.poll();
        System.out.println(s+" ");
        Iterator<Integer>i=adjacency[s].listIterator();
        while(i.hasNext())
        {
          int n = i.next();
          if (!visited[n])
          {
            visited[n] = true;
            queue.add(n);
          }
        }
      }

    }


    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the no. of vertices");
      BFS bfs=new BFS(s.nextInt());
      System.out.println("Enter the no. of edges");
      int n=s.nextInt();
      System.out.println("Enter the edges");
      for (int i=0;i<n;i++)
      {
        bfs.add_Edge(s.nextInt(),s.nextInt());
      }

      System.out.println("enter the vertex from where you want to search");
      bfs.Traversal(s.nextInt());
    }
}
