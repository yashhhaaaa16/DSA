package binary_tree;

import java.util.Scanner;

public class MyBinaryTree {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();
		int ch;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("==================================================================");
			System.out.println("========================== MENU ==================================");
			System.out.println("==================================================================");
			System.out.println("          1. Insert LevelWise");
			System.out.println("          2. PreOrder");
			System.out.println("          3. InOrder");
			System.out.println("          4. PostOrder");
			System.out.println("          5. Display");
			System.out.println("          6. Height of Tree");
			System.out.println("          7. Identical");
			System.out.println("==================================================================");
			System.out.println();
			System.out.print("Enter a Choice : ");
			ch = s.nextInt();
			switch (ch) {
			case 1: {
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				bt.insert_levelwise(d);
				bt2.insert_levelwise(d);
				break;
			}
			case 2: {
				System.out.println();
				bt.preOrder();
				break;
			}
			case 3:
			{
				System.out.println();
				bt.inOrder();
				break;
			}
			case 4:
			{
				System.out.println();
				bt.postOrder();
				break;
			}
			case 5:
			{
				System.out.println();
				bt.display_levelwise();
				break;
			}
			case 6:
			{
				System.out.println();
				bt.calHeight();
				break;
			}
			case 7:
			{
				System.out.println();
				System.out.println(bt.isIdentical(bt2));
				break;
			}
			case 0: {
				System.out.println("Exited ");
				break;
			}
			default: {
				System.out.println("Enter Valid Choice");
				break;
			}
			}

		} while (ch != 0);
	}
}
