package practice;

import java.util.Scanner;

public class Staff {
	String staffid;
	String name;
	long phone;
	int salary;
	
	void getSdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the staff id");
		staffid = in.nextLine();
		System.out.println("Enter the name");
		name = in.nextLine();
		System.out.println("Enter the phone number");
		phone = in.nextLong();
		System.out.println("Enter the salary of the staff");
		salary = in.nextInt();
	}
	
	void printSdetails()
	{
		System.out.println("Staff id:"+staffid);
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
		System.out.println("Salary:"+salary);
		System.out.println("\n");
	}

}

class Teaching extends Staff
{
	String domain;
	String publication;
	
	void getTdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the domain");
		domain = in.nextLine();
		System.out.println("Enter the publication");
		publication = in.nextLine();
	}
	
	void printTdetails()
	{
		System.out.println("Domain:"+domain);
		System.out.println("Publictaion:"+publication);
		System.out.println("\n");
	}
}

class Technical extends Staff
{
	String skills;
	
	void getT1details()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the skills");
		skills = in.nextLine();
	}
	
	void printT1details()
	{
		System.out.println("Skills:"+skills);
	}
}

class Contract extends Staff
{
	String period;
	
	void getCdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the period");
		period = in.nextLine();
	}
	
	void printCdetails()
	{
		System.out.println("Period:"+period);
	}
}

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
