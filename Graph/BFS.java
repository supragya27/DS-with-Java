package Graph;
import java.util.*;
class BreadthFirstSearch
{
	int size;
	LinkedList<LinkedList<Integer>> g;
	
	BreadthFirstSearch(int V)
	{
		size=V;
		g=new LinkedList<LinkedList<Integer>>();
		for(int i=0;i<V;i++)
		{
			g.add(new LinkedList<Integer>());
			g.get(i).add(i);			
		}
	}
	
	void addEdge(int u, int v)
	{
		g.get(u).add(v);
	}
	
	void printBFS(int source)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		boolean arr[]=new boolean[size];
		int m,n;
		
       
		
		while(!q.isEmpty())
		{
			n=q.remove();
			System.out.print(n+" ");
			arr[n]=true;
			Iterator<Integer> itr=g.get(n).listIterator();
			while(itr.hasNext())
			{
				m=itr.next();
				if(!arr[m])
				{
					q.add(m);
					arr[m]=true;
				}
			}
		}
	}
}
public class BFS {	
     public static void main(String[] args)
     {
    	 int size=5;
    	BreadthFirstSearch obj=new BreadthFirstSearch(size);
    	
    	obj.addEdge(0, 4);
    	obj.addEdge(1, 0);
    	obj.addEdge(2, 0);
    	obj.addEdge(2, 3);
    	obj.addEdge(3, 1);
    	obj.addEdge(4, 4);
    	
    	obj.printBFS(2);
    	 
    	 
     }
}
