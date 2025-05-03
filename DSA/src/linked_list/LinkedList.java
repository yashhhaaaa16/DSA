package linked_list;

public class LinkedList 
{
	private IntNode head;
	
	
	public LinkedList()
	{
		head = null;
	}
	
	
	public IntNode getHead() {
		return head;
	}


	public void setHead(IntNode head) {
		this.head = head;
	}


	public void insertFirst(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		new_node.setNext(head);
		head = new_node;
		return;
	}
	
	public void insertLast(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		IntNode itr = head;
		
		while(itr.getNext() != null)
		{
			itr = itr.getNext();
		}
		
		itr.setNext(new_node);
		return;
	}
	
	public int deleteFirst()
	{
		int d = -999;
		if(head == null)
		{
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
			return d;
		}
		
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		
		IntNode itr = head;
		
		while(itr.getNext().getNext() != null)
		{
			itr = itr.getNext();
		}
		
		d = itr.getNext().getData();
		itr.setNext(null);
		return d;
	}
	
	public void insertByPos(int d, int pos)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		if(pos == 1)
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		
		IntNode itr = head;
		int i;
		for(i=1; (i<pos-1) && (itr.getNext() != null); i++)
		{
			itr = itr.getNext();
		}
		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	
	public int deleteByPos(int pos)
	{
		int d = -999;
		if(head == null)
		{
			return d;
		}
		
		if(head.getNext() == null)
		{
			d = head.getData();
			head = null;
			return d;
		}
		
		if(pos == 1)
		{
			d = head.getData();
			head = head.getNext();
		return d;
		}
		
		IntNode itr = head;
		int i;
		for(i=1; (i<pos-1) && (itr.getNext() != null); i++)
		{
			itr =itr.getNext();
		}
		
		if(itr.getNext() != null)
		{
			d = itr.getNext().getData();
			itr.setNext(itr.getNext().getNext());
			return d;
		}
		return d;
	}
	
	public void insertBefore(int d, int key)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		if(head.getData() == key)
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		
		IntNode itr = head;
		
		while((itr.getNext() != null) && (itr.getNext().getData() != key))
		{
			itr = itr.getNext();
		}
		
		if(itr.getNext() == null)
		{
			System.out.println("Invalid Key");
			return;
		}
		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	
	public void insertAfter(int d, int key)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null)
		{
			head = new_node;
			return;
		}
		
		IntNode itr = head;
		
		while((itr != null) && (itr.getData() != key))
		{
			itr = itr.getNext();
		}
		
		if(itr == null)
		{
			System.out.println("Invalid Key");
			return;
		}
		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	
	public int deleteBefore(int key)
	{
		int d = -999;
		if(head == null)
		{
			return d;
		}
		
		if(head.getData() == key )
		{
			
			return d;
		}
		
		IntNode itr = head;
		int i;
		
		while((itr.getNext().getNext() != null) && (itr.getNext().getNext().getData() != key))
		{
			itr = itr.getNext();
		}
		
		if(itr.getNext() == null)
		{
			System.out.println("Invalid key");
			return d;
		}
		
		d = itr.getNext().getData();
		itr.setNext(itr.getNext().getNext());
		return d;
		
	}
	
	public int deleteAfter(int key)
	{
		int d =-999;
		
		if(head == null)
		{
			return d;
		}
		
		IntNode itr = head;
		
		while((itr != null) && (itr.getData() != key))
		{
			itr = itr.getNext();
		}
		
		if( itr == null)
		{
			System.out.println("Invalid Key");
			return d;
		}
		else {
		d = itr.getNext().getData();
		itr.setNext(itr.getNext().getNext());
		return d;}
	}
	
	public int countNode()
	{
		int cnt = 0;
		
		
		IntNode itr = head;
		while(itr != null)
		{
			itr = itr.getNext();
			cnt++;
		}
		
		return cnt;
	}
	
	public void insertSorted(int d)
	{
		IntNode new_node = new IntNode(d);
		
		if(head == null || head.getData() > d)
		{
			new_node.setNext(head);
			head = new_node;
			return;
		}
		
		IntNode itr = head;
		while(itr.getNext() != null && itr.getNext().getData() < d)
		{
			itr = itr.getNext();
		}
		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		return;
	}
	
	public LinkedList concat(LinkedList ll2)
	{
		LinkedList res = new LinkedList();
		IntNode itr = head;
		
		while(itr != null)
		{
			res.insertLast(itr.getData());
			itr = itr.getNext();
		}
	//	res.insertLast(itr.getData());
		
		itr = ll2.getHead();
		while(itr != null)
		{
			res.insertLast(itr.getData());
			itr = itr.getNext();
		}
		return res;
	}
	
	public LinkedList concatAlt(LinkedList ll2)
	{
		LinkedList res = new LinkedList();
		IntNode itr1 = head;
		IntNode itr2 = ll2.getHead();
		
		while(itr1 != null || itr2 != null)
		{
			if(itr1 != null) {
				res.insertLast(itr1.getData());
				itr1 = itr1.getNext();
			}
			if(itr2 != null) {
				res.insertLast(itr2.getData());
				itr2 = itr2.getNext();
			}
		}
		
		return res;
	}
	
	public void spiltEO()
	{
		LinkedList even = new LinkedList();
		LinkedList odd = new LinkedList();
		IntNode itr = head;
		while(itr.getNext() != null)
		{
			if(itr.getData() % 2 == 0)
			{
				even.insertLast(itr.getData());
				itr = itr.getNext();
			}
			
			else
			{
				odd.insertLast(itr.getData());
				itr = itr.getNext(); 
			}
			
		}
		if(itr.getData() % 2 == 0)
		{
			even.insertLast(itr.getData());
		
		}
		
		else
		{
			odd.insertLast(itr.getData());
		 
		}
		
		System.out.println("Even LinkedList : "+even.displayList());
		System.out.println("Odd LinkedList : "+odd.displayList());
	}
	
	public void reverse()
	{
		IntNode curr, prev, next;
		prev = null;
		curr = head;
		
		while(curr != null)
		{
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		
		head = prev;
		return;
	}
	
	public String displayList()
	{
		String str = "LinkedList :";
		IntNode itr = head;
		
		if(itr == null)
		{
			str = "LinkedList is Empty";
			return str;
		}
		while(itr != null)
		{
			str = str+" "+itr.getData();
			itr = itr.getNext();
		}

		return str;
	}

}
