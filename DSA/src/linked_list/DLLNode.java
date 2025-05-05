package linked_list;

public class DLLNode {

	private int data;
	private DLLNode prev,next;
	
	public DLLNode()
	{
		data = 0;
		prev = next = null;
	}
	
	public DLLNode(int d)
	{
		data = d;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	
}
