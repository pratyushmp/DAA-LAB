package practice;

import java.util.Scanner;

public class Floyds {
	
	public static void floyd(int a[][], int n)
	{
		int i,j,k;
		int d[][] = new int[10][10];
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				d[i][j] = a[i][j];
			}
		}
		
		for(k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					d[i][j] = min(d[i][j],d[i][k]+d[k][j]);
				}
			}
		}
		
		System.out.println("The distance matrix is");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	public static int min(int a, int b)
	{
		if(a<b)
			return a;
		else
			return b;
	}
	
	public static void main(String args[])
	{
		int n,i,j;
		int a[][] = new int[10][10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		n = in.nextInt();
		System.out.println("Enter the cost of adjacency matrix");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j] = in.nextInt();
		floyd(a,n);
	}

}
