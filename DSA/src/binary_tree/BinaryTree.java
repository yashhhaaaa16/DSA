package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private BTNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public void setRoot(BTNode root)
	{
		this.root = root;
	}
	
	public BTNode getRoot()
	{
		return root;
	}
	
	public BTNode createNode(int d)
	{
		return new BTNode(d);
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
	
	public void insert_levelwise(int d)
	{
		BTNode new_node = new BTNode (d);
		
		if(root == null)
		{
			root = new_node;
			return;
		}
		
		BTNode itr;
		Queue<BTNode> q = new LinkedList<BTNode> ();
		q.add(root);
		
		while(true)
		{
			itr = q.remove();
			if(itr.getLeft() == null)
			{
				itr.setLeft(new_node);
				return;
			}
			else {
				q.add(itr.getLeft());
			}
			if(itr.getRight() == null)
			{
				itr.setRight(new_node);
				return;
			}
			else {
				q.add(itr.getRight());
			}
			
		}
		
	}
	
	public void display_levelwise()
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
	
	public void calHeight()
	{
		if(root == null)
		{
			System.out.println("Height of tree is : 0");
			return;
		}
		
		BTNode itr;
		Queue<BTNode> q = new LinkedList<BTNode> ();
		q.add(root);
		BTNode d = new BTNode();
		q.add(d);
		int cnt = 0;
		
		while(!q.isEmpty())
		{
			itr = q.remove();
			if(itr == d)
			{
				cnt +=1;
				q.add(d);
				itr = q.remove();
			}
			
			if(itr.getLeft() != null)
				q.add(itr.getLeft());
			if(itr.getRight() != null)
				q.add(itr.getRight());
		}
		System.out.println("Height of tree is : "+cnt);
		
	}
	
	public boolean isIdentical(BinaryTree bt2)
	{
		BTNode itr1,itr2;
		if(root == null || bt2.getRoot() == null)
			return false;
		
		Queue<BTNode> q1 = new LinkedList<BTNode> ();
		Queue<BTNode> q2 = new LinkedList<BTNode> ();
		
		q1.add(root);
		q2.add(bt2.getRoot());
		
		while(!q1.isEmpty() && !q2.isEmpty())
		{
			itr1 = q1.remove();
			itr2 = q2.remove();
			
			if(itr1.getData() != itr2.getData())
				return false;
			
			if(itr1.getLeft() != null)
				q1.add(itr1.getLeft());
			if(itr1.getRight() != null)
				q1.add(itr1.getRight());
			if(itr2.getLeft() != null)
				q2.add(itr2.getLeft());
			if(itr2.getRight() != null)
				q2.add(itr2.getRight());
		}
		
		if(q1.isEmpty() && q2.isEmpty())
			return true;
		else
			return false;
	}
	
	
}
