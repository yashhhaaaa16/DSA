package queue;

public class CircularQueue {

	private int arr[];
	private int front,rear;
	
	public CircularQueue()
	{
		arr = new int[10];
		front = rear = -1;
	}
	
	public CircularQueue(int d)
	{
		arr = new int[d];
		front = rear = -1;
	}
	
	public boolean isFull()
	{
		if((front == 0 && rear == arr.length-1) || (front - rear == 1))
		{
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	public void insert(int d)
	{
		if(isFull())
		{
			System.out.println("OverFlow !!!");
			return ;
		}
		if(front == -1)
		{
			front = 0;
		}
		if(rear == arr.length-1)
			rear = 0;
		else
			rear += 1;
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("Underflow !!!");
			return -999;
		}
		int d = arr[front];
		
		if(front == rear)
			front = rear = -1;
		else if (front == arr.length-1)
			front = 0;
		else
			front = front + 1;
		return d;
	}
}
