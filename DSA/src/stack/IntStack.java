package stack;

public class IntStack 
{
	private int arr [];
	private int top;
	
	public IntStack()
	{
		arr = new int [10];
		top = -1;
	}
	
	public IntStack(int s)
	{
		arr = new int [s];
		top = -1;
	}
	
	public void push(int d)
	{
		if(top == arr.length-1)
		{
			System.out.println("Stack Overflow !!!!!");
			return;
		}
		top = top + 1;
		arr[top] = d;
		return;
	}
	
	public int pop()
	{
		int d = -999;
		if(top == -1)
		{
			System.out.println("Stack Underflow !!!!!");
			return d;
		}
		
		d = arr[top];
		top = top - 1;
		return d;
	}
	
	public int peek()
	{
		int d = -999;
		if(top == -1)
		{
			System.out.println("Stack Underflow !!!!!");
			return d;
		}
		d = arr[top];
		
		return d;
	}
	
	public boolean isFull()
	{
		if(top == arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
