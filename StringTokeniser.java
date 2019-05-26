package practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokeniser
{
	public String readcustomer()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name and DOB in <name,dd/mm/yyyy> format only");
		String st = in.next();
		if(!st.startsWith("<") && !st.endsWith(">"))
		{
			System.out.println("Enter name and DOB in correct format");
			System.exit(0);
		}
		return st;
	}
	
	public void displaycustomer(String data)
	{
		String st = data.substring(0,data.length());
		StringTokenizer token = new StringTokenizer(st,"</>");
		String finalstring = null;
		while(token.hasMoreTokens())
		{
			if(finalstring == null)
				finalstring = token.nextToken();
			else
			{
				finalstring = finalstring+","+token.nextToken();
			}
		}
		System.out.println("Final string is"+"<"+finalstring+">");
	}
	
	public static void main(String args[])
	{
		StringTokeniser s = new StringTokeniser();
		String data = s.readcustomer();
		s.displaycustomer(data);
	}
}