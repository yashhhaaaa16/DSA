package stack;

public class StudStack 
{
	private Student[] stud;
	private int top;
	
	public StudStack()
	{
		stud = new Student [10];
		top = -1;
	}	
	
	public StudStack(int s)
	{
		stud = new Student [s];
		top = -1;
	}
	
	public void push(Student stud)
	{
		if(top == this.stud.length-1) 
		{
			System.out.println("Stack Overflow !!!!");
		}
		top += 1;
		this.stud[top] = stud;
		return;
	}
	
	public Student pop()
	{
		Student stud1 = new Student("",0,0,0.0f);
		if(top == -1)
		{
			System.out.println("Stack Underflow !!!!");
			return stud1;
		}
		stud1 = stud[top];
		top -= 1;
		return stud1;
	}
	
	public Student peek()
	{
		Student stud1 = new Student("",0,0,0.0f);
		if(top == -1)
		{
			System.out.println("Stack Underflow !!!!");
			return stud1;
		}
		stud1 = stud[top];
	
		return stud1;
		
	}
	
	public boolean isFull()
	{
		if(top == this.stud.length-1)
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
