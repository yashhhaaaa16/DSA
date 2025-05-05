package linked_list;

public class DoublyLL {

	private DLLNode head;

	public DoublyLL() {
		head = null;
	}

	public void setHead(DLLNode head) {
		this.head = head;
	}

	public DLLNode getHead() {
		return head;
	}

	public void insertFirst(int d) {
		DLLNode new_node = new DLLNode(d);

		if (head == null) {
			head = new_node;
			return;
		}

		new_node.setNext(head);
		head.setPrev(new_node);
		head = new_node;
		return;
	}

	public void insertLast(int d) {
		DLLNode new_node = new DLLNode(d);

		if (head == null) {
			head = new_node;
			return;
		}

		DLLNode itr = head;
		while (itr.getNext() != null)
			itr = itr.getNext();

		new_node.setPrev(itr);
		itr.setNext(new_node);
		return;
	}

	public int deleteFirst() {
		int d = -999;

		if (head == null)
		{
			System.out.println("List is Empty");
			return d;
		}
			
		d = head.getData();
		head = head.getNext();
		return d;

	}
	
	public int deleteLast()
	{
		int d = -999;
		
		if(head == null)
		{
			System.out.println("List is Empty");
			return d;
		}
		
		DLLNode itr = head;
		while(itr.getNext() != null)
		{
			itr = itr.getNext();
		}
		
		d = itr.getData();
		DLLNode deletable = itr;
		itr.getPrev().setNext(null);
		deletable.setPrev(null);
		deletable = null;
		return d;
	}
	
	public void insertByPos(int d, int pos)
	{
		DLLNode new_node = new DLLNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		if(pos == 1)
		{
			new_node.setNext(head);
			head.setPrev(new_node);
			head = new_node;
			return;
		}
		
		DLLNode itr = head;
		int i;
		for(i=1; i<pos-1 && itr!= null; i++)
		{
			itr = itr.getNext();
		}
		
		if(itr == null)
		{
			System.out.println("Invalid Position");
			return;
		}
		
		new_node.setPrev(itr);
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		new_node.getNext().setPrev(new_node);
	}
	
	
	public int deleteByPos(int pos)
	{
		int d = -999;
		if(head == null)
			return d;
		
		if(pos == 1)
		{
			d = head.getData();
			head = head.getNext();
			return d;
		}
		
		DLLNode itr = head;
		int i;
		for(i=1; i<pos-1 && itr.getNext() != null; i++)
		{
			itr = itr.getNext();
		}
		
		if(itr.getNext() == null)
		{
			System.out.println("Invalid Position");
			return d;
		}
		
		d = itr.getNext().getData();
		DLLNode deletable = itr.getNext();
		itr.setNext(itr.getNext().getNext());
	
		deletable.setPrev(null);
		deletable.setNext(null);
		deletable = null;
		return d;
	}
	
	public void display()
	{
		DLLNode itr = head;
		while(itr != null)
		{
			System.out.print(itr.getData()+" ");
			itr = itr.getNext();
		}
	}
}
