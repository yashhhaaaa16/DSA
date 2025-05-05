package linked_list;

import java.util.Scanner;

public class CircularLLMenu {

	public static void main(String[] args) {
		
		CircularLinkedList cl = new CircularLinkedList();
		int ch;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("==================================================================");
			System.out.println("========================== MENU ==================================");
			System.out.println("==================================================================");
			System.out.println("          1. Insert First");
			System.out.println("          2. Insert Last");
			System.out.println("          3. Delete First");
			System.out.println("          4. Delete Last");
			System.out.println("          5. Insert by Position");
			System.out.println("          6. Delete by Position");
			System.out.println("          7. Display");
			System.out.println("          0. Exit");
			System.out.println("==================================================================");
			System.out.println();
			System.out.print("Enter a Choice : ");
			ch = s.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				cl.insertFirst(d);
				break;
			}
			case 2:
			{
				System.out.println();
				System.out.print("Enter Data to Enter : ");
				int d = s.nextInt();
				cl.insertLast(d);
				break;
			}
			case 3:
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println(cl.deleteFirst());
				System.out.println("--------------------------------------------------------------");
				break;
			}
			case 4:
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				System.out.println(cl.deleteLast());
				System.out.println("--------------------------------------------------------------");
				break;
			}
			
			case 5:
			{
				System.out.println();
				System.out.print("Enter a Position to enter Data : ");
				int pos = s.nextInt();
				System.out.println();
				System.out.print("Enter Data to enter at position "+pos+" : ");
				int d = s.nextInt();
				cl.insertByPos(d, pos);
				break;
			}
			case 6:
			{
				System.out.println();
				System.out.print("Enter a Position to delete Data : ");
				int pos = s.nextInt();
				System.out.println(cl.deleteByPos(pos));
				break;
			}
			case 7:
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				cl.display();
				System.out.println();
				System.out.println("--------------------------------------------------------------");
				break;
			}
			case 0:
			{
				System.out.println("Exited Sucessfully");
				break;
			}
			default :
			{
				System.out.println("Enter a Valid Choice");
				break;
			}
			}
		}while(ch != 0);
	}
}
