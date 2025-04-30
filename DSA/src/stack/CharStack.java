package stack;

public class CharStack {
	private char arr [];
	private int top;
	
	public CharStack()
	{
		arr = new char [10];
		top = -1;
	}
	
	public CharStack(int s)
	{
		arr = new char [s];
		top = -1;
	}
	
	public void push(char d)
	{
		if(top == arr.length-1)
		{
			System.out.println("Stack Overflow !!!!!");
			return;
		}
		top+=1;
		arr[top] = d;
		return;
	}
	
	public char pop()
	{
		char d = '▀';
		if(top == -1)
		{
			System.out.println("Stack Underflow !!!!!");
			return d;
		}
		
		d = arr[top];
		top-=1;
		return d;
	}
	
	public char peek()
	{
		char d = '▀';
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
