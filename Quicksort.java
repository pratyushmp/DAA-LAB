package practice;

import java.util.Random;
import java.util.Scanner;

public class Quicksort {
	
	public static int partition(int a[], int low, int high)
	{
		int temp,i,j,key;
		key = a[low];
		i = low;
		j = high+1;
		
		while(i<=j)
		{
			do
				i++;
			while(key>=a[i] && i<=high);
			do
				j--;
			while(a[j]>key);
			if(i<j)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
			temp = a[low];
			a[low] = a[j];
			a[j] = temp;
			return j;
	}
	
	public static void qs(int a[], int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid = partition(a,low,high);
			qs(a,low,mid-1);
			qs(a,mid+1,high);
		}
	}
	
	public static void main(String args[])
	{
		int i,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = in.nextInt();
		Random rand = new Random();
		int a[] = new int[50];
		try
		{
			for(i=0;i<n;i++)
				a[i] = rand.nextInt(50);
			System.out.println("Random elements generated are");
			for(i=0;i<n;i++)
				System.out.println(a[i]+" ");
			long start_t = System.nanoTime();
			qs(a,0,n-1);
			long end_t = System.nanoTime();
			long t = start_t-end_t;
			System.out.println("Sorted elements are");
			for(i=0;i<n;i++)
				System.out.println(a[i]+" ");
			System.out.println("Time taken to sort:"+t);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array overload");
		}
	}

}
