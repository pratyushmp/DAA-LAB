package practice;
import java.util.Scanner;
public class student {
	String usn;
	String name;
	String branch;
	long phone;
	
	void getdetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name = in.nextLine();
		System.out.println("Enter the usn of the student");
		usn = in.nextLine();
		System.out.println("Enter the branch of the student");
		branch = in.nextLine();
		System.out.println("Enter the phone number of the student");
		phone = in.nextLong();
	}
	
	void printdetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Usn:"+usn);
		System.out.println("Branch:"+branch);
		System.out.println("Phone:"+phone);
		System.out.println("\n");
	}

	
	public static void main(String args[])
	{
		int n,i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = in.nextInt();
		student a[] = new student[n];
		for(i=0;i<n;i++)
			a[i] = new student();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter details of student"+(i+1));
			a[i].getdetails();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Details of student"+(i+1));
			a[i].printdetails();
		}
	}
}
