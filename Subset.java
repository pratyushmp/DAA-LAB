package practice;

import java.util.Scanner;

public class Subset {
	
	private static int d;
	private static int count = 0;
	private static int x[] = new int[10];
	private static int w[] = new int[10];
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter the number of elements");
		n = in.nextInt();
		System.out.println("Enter the elements in ascending order");
		for(i=0;i<n;i++)
			w[i] = in.nextInt();
		
		System.out.println("Enter the sum");
		d = in.nextInt();
		
		for(i=0;i<n;i++)
			sum+=w[i];
		
		if(sum<d)
		{
			System.out.println("No solution");
			return;
		}
		subset(0,0,sum);
		if(count == 0)
		{
			System.out.println("No Solutions exist");
			return;
		}
	}
	
	static void subset(int cs, int k, int r)
	{
		int i;
		x[k] = 1;
		if(cs+w[k] == d)
		{
			System.out.println("Subset: "+(++count));
			for(i=0;i<=k;i++)
				if(x[i] == 1)
					System.out.println(w[i]+" ");
		}
		
		else if(cs+w[k]+w[k+1] <= d)
			subset((cs+w[k]),k+1,r-w[k]);
		
		if(cs+r-w[k] >= d && cs+w[k] <= d)
		{
			x[k] = 0;
			subset(cs,k+1,r-w[k]);
		}
	}

}