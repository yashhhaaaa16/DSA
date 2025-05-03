package queue;

public class IntQueue {

	private int arr [];
	private int front,rear;
	
	public IntQueue()
	{
		arr = new int[10];
		front = rear = -1; 
	}
	
	public IntQueue(int d)
	{
		arr = new int[d];
		front = rear = -1;
	}
	
	public boolean isFull()
	{
		if(rear == arr.length-1)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if((front == -1) || (front-rear == 1))
			return true;
		else
			return false;
	}
	
	public void insert(int d)
	{
		if(isFull())
		{
			System.out.println("OverFolw !!!!");
			return;
		}
		if(front == 1)
		{
			front = 0;
		}
		rear += 1;
		arr[rear] = d;
		return;
	}
	
	public int remove()
	{
		int d = -999;
		if(isEmpty()) {
			System.out.println("UnderFlow !!!");
			return d;
		}
		d = arr[front];
		front = front + 1;
		return d;
	}
	
	public int peek()
	{
		int d = -999;
		if(isEmpty()) {
			System.out.println("UnderFlow !!!");
			return d;
		}
		d = arr[front];
		
		return d;
	}
}
