package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	private BTNode root;

	public void setRoot(BTNode root) {
		this.root = root;
	}

	public BTNode getRoot() {
		return root;
	}

	public void insert(int d) {

		BTNode new_node = new BTNode(d);

		if (root == null) {
			root = new_node;
			return;
		}

		BTNode itr = root;

		while (true) {
			if (d < itr.getData()) {
				if (itr.getLeft() == null) {
					itr.setLeft(new_node);
					return;
				}
				itr = itr.getLeft();
			} else if (d > itr.getData()) {
				if (itr.getRight() == null) {
					itr.setRight(new_node);
					return;
				}
				itr = itr.getRight();
			} else {
				System.out.println("Duplicate Value ---");
				return;
			}

		}
	}

	public void insertPar(int d) {
		BTNode new_node = new BTNode(d);

		if (root == null) {
			root = new_node;
			return;
		}

		BTNode itr = root;
		BTNode par = null;

		while (itr != null) {
			par = itr;
			if (d < itr.getData()) {
				itr = itr.getLeft();
			} else if (d > itr.getData()) {
				itr = itr.getRight();
			} else {
				System.out.println("Duplicate Data");
				return;
			}
		}

		if (d < par.getData()) {
			par.setLeft(new_node);
			return;
		} else {
			par.setRight(new_node);
			return;
		}
	}
	
	public void insert_rec(int d)
	{
		root = insert_rec(root, d);
	}
	
	private BTNode insert_rec(BTNode r, int d)
	{
		if(r == null)
		{
			return new BTNode(d);
		}
		
		if(d < r.getData())
		{
			r.setLeft(insert_rec(r.getLeft(),d));
		}
		else if(d > r.getData())
		{
			r.setRight(insert_rec(r.getRight(),d));
		}
		else
		{
			System.out.println("Duplicate Data");
		}
		
		return r;
	}
	
	public void display()
	{
		if(root == null)
		{
			System.out.println("Tree is Empty");
			return;
		}
		
		BTNode itr;
		Queue<BTNode> q = new LinkedList<BTNode> ();
		q.add(root);
		
		while(!q.isEmpty())
		{
			itr = q.remove();
			System.out.print(itr.getData()+" ");
			if(itr.getLeft() != null)
				q.add(itr.getLeft());
			if(itr.getRight() != null)
				q.add(itr.getRight());
		}
	}
	
	public void preOrder()
	{
		visit_preOrder(root);
	}
	
	private void visit_preOrder(BTNode root)
	{
		if(root == null)
			{
				return;
			}
		
		System.out.print(root.getData()+" ");
		visit_preOrder(root.getLeft());
		visit_preOrder(root.getRight());
		return;
	}
	
	public void inOrder()
	{
		visit_inOrder(root);
	}
	
	private void visit_inOrder(BTNode root)
	{
		if(root == null)
		{
			return;
		}
		
		visit_inOrder(root.getLeft());
		System.out.print(root.getData()+" ");
		visit_inOrder(root.getRight());
		return;
		
	}
	
	public void postOrder()
	{
		visit_postOrder(root);
	}
	
	private void visit_postOrder(BTNode root)
	{
		if(root == null)
		{
			return;
		}
		
		visit_postOrder(root.getLeft());
		visit_postOrder(root.getRight());
		System.out.print(root.getData()+" ");
		return;
	}
	
	public BTNode search(int d)
	{
		return search_rec(root,d);
	}
	
	private BTNode search_rec(BTNode r, int d)
	{
		if(r == null)
			return null;
		
		if(d < r.getData())
			{
			search_rec(r.getLeft(),d);
			return r;
			}
		else if(d > r.getData())
			{
			search_rec(r.getRight(),d);
			return r;
			}
		else
			return r;
	}
	
	
	public void delete(int d)
	{
		root = delete_rec(root,d);
	}
	
	private BTNode delete_rec(BTNode r, int d)
	{
		BTNode succ;
		
		if(r == null)
		{
			System.out.println("Tree is Empty");
			return null;
		}
		
		if(d < r.getData())
			r.setLeft(delete_rec(r.getLeft(),d));
		else if (d > r.getData())
			r.setRight(delete_rec(r.getRight(),d));
		else
		{
			if(r.getLeft() != null && r.getRight() != null)
			{
				succ = r.getRight();
				while(succ.getLeft() != null)
				{
					succ = succ.getLeft();
				}
				r.setData(succ.getData());
				r.setRight(delete_rec(r.getRight(),r.getData())); //succ.getData()
			}
			else
			{
				if(r.getLeft() != null)
					r = r.getLeft();
				else if(r.getRight() != null)
					r = r.getRight();
				else
					r = null;
			}
		}
		return r;
	}
}
