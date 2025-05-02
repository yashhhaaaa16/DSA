package linked_list;

public class IntNode 
{
	private int data;
	private IntNode next;
	
	public IntNode()
	{
		data = 0;
		next = null;
	}
	
	public IntNode(int d)
	{
		data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getNext() {
		return next;
	}

	public void setNext(IntNode next) {
		this.next = next;
	}

	
}
