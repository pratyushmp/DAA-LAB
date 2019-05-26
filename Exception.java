package practice;

import java.util.Scanner;

public class Exception {
	public static void main(String args[])
	{
		int a,b,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dividend");
		a = in.nextInt();
		System.out.println("Enter the divisor");
		b = in.nextInt();
		try
		{
			d = a/b;
			System.out.println("The result is:"+d);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Division by zero error");
		}
	}

}
