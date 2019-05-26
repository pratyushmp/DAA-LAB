package practice;

import java.util.Scanner;

public class Stack {
	int top;
	int size;
	int stack[];
	
	public Stack(int arraysize)
	{
		size = arraysize;
		stack= new int[size];
		top = -1;
		
	}
	
	public void push(int value)
	{
		if(top == size-1)
			System.out.println("Stack is full");
		else
		{
			stack[++top] = value;
		}
	}
	
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
			return stack[top--];	
	}
	
	public void display()
	{
		int i;
		for(i=top;i>=0;i--)
			System.out.println(stack[i]+" ");
		System.out.println("\n");
	}
	
	public static void main(String args[])
	{
		int n,ch,choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		n = in.nextInt();
		Stack stk = new Stack(n);
		System.out.println("Enter your choice");
		do
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			ch = in.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter the element to be pushed into the stack");
			        stk.push(in.nextInt());
			        break;
			  
			case 2: System.out.println("Popped element is");
			        int s = stk.pop();
			        if(s!=-1)
			        	System.out.println(s);
			        break;
			        
			case 3: stk.display();
					break;
			}
			
			System.out.println("Press 1 to continue else press 0");
			choice = in.nextInt();
		}
		
		while(choice == 1);
	}

}
