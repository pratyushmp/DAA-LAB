package practice;

public class Hamiltonian {
	
	final int V = 5;
	int path[];
	
	boolean isafe(int v, int graph[][], int path[], int pos)
	{
		if(graph[path[pos-1]][v] == 0)
			return false;
		for(int i=0;i<pos;i++)
			if(path[i] == v)
				return false;
		return true;
	}
	
	boolean hamcycleutil(int graph[][], int path[], int pos)
	{
		if(pos == V)
		{
			if(graph[path[pos-1]][path[0]] == 1)
				return true;
			else 
				return false;
		}
		
		for(int v=1;v<V;v++)
		{
			if(isafe(v,graph,path,pos))
			{
				path[pos] = v;
				if(hamcycleutil(graph,path,pos+1) == true)
					return true;
				path[pos] = -1;
			}
		}
		return false;
	}
	
	int hamcycle(int graph[][])
	{
		path = new int[V];
		for(int i=0;i<V;i++)
			path[i] = -1;
		path[0] = 0;
		if(hamcycleutil(graph,path,1) == false)
		{
			return 0;
		}
		
		printsolution(path);
		return 1;
		
	}
	
	void printsolution(int path[])
	{
		System.out.println("Solution exists: Following is one of the hamiltonian cycle");
		for(int i=0;i<V;i++)
			System.out.println(" "+path[i]+" ");
		System.out.println(" "+path[0]+" ");
	}
	
	public static void main(String args[])
	{
		Hamiltonian hamiltonian = new Hamiltonian();
		int graph1[][] = { {0,1,0,1,0},
						   {1,0,1,1,1},
						   {0,1,0,0,1},
						   {1,1,0,0,1},
						   {0,1,1,1,0}
						 };
		hamiltonian.hamcycle(graph1);
		
		int graph2[][] = { {0,1,0,1,0},
						   {1,0,1,1,1},
						   {0,1,0,0,1},
						   {1,1,0,0,0},
						   {0,1,1,0,0}
						 };
		hamiltonian.hamcycle(graph2);
	}
}
