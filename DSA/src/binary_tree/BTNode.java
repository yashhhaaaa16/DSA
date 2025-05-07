package binary_tree;

public class BTNode {

	private int data;
	private BTNode left,right;
	
	public BTNode()
	{
		data = 0;
		left = right = null;
	}
	
	public BTNode(int d)
	{
		data = d;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int d)
	{
		data = d;
	}
	
	public BTNode getLeft()
	{
		return left;
	}
	
	public void setLeft(BTNode left)
	{
		this.left = left;
	}
	
	public BTNode getRight()
	{
		return right;
	}
	
	public void setRight(BTNode right)
	{
		this.right = right;
	}
}
