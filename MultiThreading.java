package practice;

import java.util.Random;
import java.util.Scanner;
	
class Runnable1 implements Runnable
{
	public void run()
	{
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be squared");
		a = in.nextInt();
		b = a*a;
		System.out.println("The square of "+a+" is:"+b);
	}
}

class Runnable2 implements Runnable
{
	public void run()
	{
		int c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to cubed");
		c = in.nextInt();
		d = c*c*c;
		System.out.println("The cube of "+c+" is:"+d);
	}
}
	
class Runnable3 implements Runnable
{
	int i,n;
	public void run()
	{
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements to be generated");
		n = in.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
			a[i] = rand.nextInt(50);
		System.out.println("Random elements generated are");
		for(i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}
}
public class MultiThreading {
	public static void main(String args[]) throws InterruptedException
	{
		Runnable r1 = new Runnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread.sleep(5000);
		
		Runnable r2 = new Runnable2();
		Thread t2 = new Thread(r2);
		t2.start();
		Thread.sleep(5000);
		
		Runnable r3 = new Runnable3();
		Thread t3 = new Thread(r3);
		t3.start();
		Thread.sleep(5000);
	}
}


