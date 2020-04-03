import java.util.*;

public class AdjList {
    
	static void addEdge(ArrayList<ArrayList<Integer>> arl, int s, int e)
	{
		arl.get(s).add(e);
		arl.get(e).add(s);
	}
	static void printGraph(ArrayList<ArrayList<Integer>> arl)
	{
		for(int i=0;i<arl.size();i++)
		{
			for(int j=0;j<arl.get(i).size();j++)
			{
				System.out.print(arl.get(i).get(j)+" ");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args)
	{
		int size=5;
		ArrayList<ArrayList<Integer>> arl=new ArrayList<>(size);
		for(int i=0;i<size;i++)
		{
			arl.add(new ArrayList<Integer>());
		}
		
		addEdge(arl, 0, 1); 
        addEdge(arl, 0, 4); 
        addEdge(arl, 1, 2); 
        addEdge(arl, 1, 3); 
        addEdge(arl, 1, 4); 
        addEdge(arl, 2, 3); 
        addEdge(arl, 3, 4); 
        
        printGraph(arl);
	}
	
	
}
