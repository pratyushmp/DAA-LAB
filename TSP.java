package practice;

import java.util.Scanner;

public class TSP {
	final static int MAX = 100;
	final static int INFINITY = 999;
	
	static int tsp_dp(int c[][], int tour[], int start, int n)
	{
		int i,j,k;
		int temp[] = new int[MAX];
		int mintour[] = new int[MAX];
		int min_cost,ccost;
		
		if(start == n-2)
			return(c[tour[n-2]][tour[n-1]]+c[tour[n-1]][0]);
		min_cost = INFINITY;
		
		for(i=start+1;i<n;i++)
		{
			for(j=0;j<n;j++)
				temp[j] = tour[j];
			temp[start+1] = tour[i];
			temp[i] = tour[start+1];
			
			if(c[tour[start]][tour[i]]+(ccost = tsp_dp(c,temp,start+1,n))<min_cost)
			{
				min_cost = ccost + c[tour[start]][tour[i]];
				for(k=0;k<n;k++)
					mintour[k] = temp[k];
			}
		}
		
		for(i=0;i<n;i++)
			tour[i] = mintour[i];
		tour[i] = start;
		return min_cost;
	}
	
	public static void main(String args[])
	{
		int n,i,j,cost;
		int c[][] = new int[MAX][MAX];
		int tour[] = new int[MAX];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of cities");
		n = in.nextInt();
		System.out.println("Enter the cost matrix");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				c[i][j] = in.nextInt();
		for(i=0;i<n;i++)
			tour[i] = i;
		cost = tsp_dp(c,tour,0,n);
		System.out.println("Minimum cost by dynamic programming: "+cost);
		System.out.println("\n Tour");
		for(i=0;i<n;i++)
			System.out.print(tour[i]+1+"\t");
	}

}
