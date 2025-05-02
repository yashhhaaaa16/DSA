package linked_list;

public class LinkedList 
{
	private IntNode head;
	
	
	public LinkedList()
	{
		head = null;
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
	
	public String displayList()
	{
		String str = "LinkedList :";
		IntNode itr = head;
		while(itr != null)
		{
			str = str+" "+itr.getData();
			itr = itr.getNext();
		}
		return str;
	}

}
