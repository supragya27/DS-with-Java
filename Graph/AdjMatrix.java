package Graph;

public class AdjMatrix {
    
	static void addEdge(int[][] adj,int s,int e)
	{
		adj[s][e]=1;
		adj[e][s]=1;
	}
	static void printAM(int[][] adm)
	{
		for(int i=0;i<adm.length;i++)
		{
			for(int j=0;j<adm.length;j++)
			{
				System.out.print(adm[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int size=5;
		int[][] adm=new int[size][size];
		
		addEdge(adm, 0, 1); 
        addEdge(adm, 0, 4); 
        addEdge(adm, 1, 2); 
        addEdge(adm, 1, 3); 
        addEdge(adm, 1, 4); 
        addEdge(adm, 2, 3); 
        addEdge(adm, 3, 4);
        
        printAM(adm);
		
	}
}
