package practice;

import java.util.Scanner;

class Inheritance
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of staffs");
		n = in.nextInt();
		Staff sf[] = new Staff[n];
		Teaching t[] = new Teaching[n];
		Technical t1[] = new Technical[n];
		Contract c[] = new Contract[n];
		
		for(i=0;i<n;i++)
		{
			sf[i] = new Staff();
			t[i] = new Teaching();
			t1[i] = new Technical();
			c[i] = new Contract();
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter details of staff"+(i+1));
			sf[i].getSdetails();
			t[i].getTdetails();
			t1[i].getT1details();
			c[i].getCdetails();
			System.out.println("--------------");
		}
		
		for(i=0;i<n;i++)
		{
			System.out.println("Details of staff"+(i+1));
			sf[i].printSdetails();
			t[i].printTdetails();
			t1[i].printT1details();
			c[i].printCdetails();
			System.out.println("--------------");
		}
	}
}