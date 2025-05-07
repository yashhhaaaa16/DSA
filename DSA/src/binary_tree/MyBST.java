package binary_tree;

import java.util.Scanner;

public class MyBST {

	public static void main(String[] args) {
		
		BST bt = new BST ();
		int ch;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("==================================================================");
			System.out.println("========================== MENU ==================================");
			System.out.println("==================================================================");
			System.out.println("          1. Insert ");
			System.out.println("          2. Insert Parent");
			System.out.println("          3. Insert Recursive");
			System.out.println("          4. Display");
			System.out.println("          5. PreOrder");
			System.out.println("          6. InOrder");
			System.out.println("          7. PostOrder");
			System.out.println("          8. Serach");
			System.out.println("          9. Delete");
			System.out.println("==================================================================");
			System.out.println();
			System.out.print("Enter a Choice : ");
			ch = s.nextInt();
			switch (ch) {
			case 1: {
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				bt.insert(d);
				break;
			}
			case 2:
			{
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				bt.insertPar(d);
				break;
			}
			case 3:
			{
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				bt.insert_rec(d);
				break;
			}
			case 4:
			{
				System.out.println();
				bt.display();
				break;
			}
			case 5:
			{
				System.out.println();
				bt.preOrder();
				break;
			}
			case 6:
			{
				System.out.println();
				bt.inOrder();
				break;
			}
			case 7:
			{
				System.out.println();
				bt.postOrder();
				break;
			}
			case 8:
			{
				System.out.println();
				System.out.print("Enter Data to Search : ");
				int d = s.nextInt();
				bt.search(d);
				break;
			}
			case 9:
			{
				System.out.println();
				System.out.print("Enter Data to Delete : ");
				int d = s.nextInt();
				bt.delete(d);
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
