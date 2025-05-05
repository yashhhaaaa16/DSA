package linked_list;

public class CircularLinkedList {

	IntNode last;

	public CircularLinkedList() {
		last = null;
	}

	public IntNode getLast() {
		return last;
	}

	public void setLast(IntNode last) {
		this.last = last;
	}

	public void insertFirst(int d) {
		IntNode new_node = new IntNode(d);

		if (last == null) {
			last = new_node;
			last.setNext(last);
			return;
		}

		new_node.setNext(last.getNext());
		last.setNext(new_node);
		return;
	}

	public void insertLast(int d) {
		IntNode new_node = new IntNode(d);

		if (last == null) {
			last = new_node;
			last.setNext(new_node);
			return;
		}

		new_node.setNext(last.getNext());
		last.setNext(new_node);
		last = new_node;
		return;
	}

	public int deleteFirst() {
		int d = -999;

		if (last == null)
			return d;

		if (last.getNext() == last) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}

		d = last.getNext().getData();
		IntNode deletable = last.getNext();
		last.setNext(last.getNext().getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public int deleteLast() {
		int d = -999;

		if (last == null)
			return d;

		if (last.getNext() == last) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}

		IntNode itr = last.getNext();

		do {
			itr = itr.getNext();
		} while (itr.getNext() != last);
		{
			d = itr.getNext().getData();
			itr.setNext(last.getNext());
			last.setNext(null);
			last = itr;
			return d;
		}
	}

	public void insertByPos(int d, int pos) {
		IntNode new_node = new IntNode(d);

		if (last == null) {
			last = new_node;
			new_node.setNext(new_node);
			return;
		}

		if (pos == 1) {
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			return;
		}

		IntNode itr = last.getNext();
		int i = 1;
		
		while(itr != last && i<pos-1)
		{
			itr = itr.getNext();
			i++;
		}
		
		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
		
		if(itr == last)
			last = new_node;
	}

	public int deleteByPos(int pos) {
		int d = -999;
		if (last == null)
			return d;

		if (pos == 1) {
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}

		IntNode itr = last.getNext();
		for(int i = 1; itr!=last && i<pos-1; i++)
			itr = itr.getNext();
		
		if(itr == last)
		{
			System.out.println("Invalid Position");
			return d;
		}
		
		IntNode deletable = itr.getNext();
		d = itr.getNext().getData();
		itr.setNext(itr.getNext().getNext());
		deletable.setNext(null);
		deletable = null;
		return d;
	}

	public void display() {
		if (last == null) {
			System.out.println("List is Empty");
			return;
		}

		IntNode itr = last.getNext();

		while (true) {
			System.out.print(itr.getData() + " ");
			if (itr.getNext() == last.getNext())
				return;
			itr = itr.getNext();
		}
	}
}
