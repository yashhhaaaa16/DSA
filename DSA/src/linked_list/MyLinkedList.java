package linked_list;

import java.util.Scanner;

public class MyLinkedList {
	
	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList();
		LinkedList ll2 = new LinkedList();
		int ch;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("==================================================================");
			System.out.println("========================== MENU ==================================");
			System.out.println("==================================================================");
			System.out.println("          1. Insert First");
			System.out.println("          2. Insert Last");
			System.out.println("          3. Delete First");
			System.out.println("          4. Delete Last");
			System.out.println("          5. Insert By Position");
			System.out.println("          6. Delete By Position");
			System.out.println("          7. Insert Before");
			System.out.println("          8. Insert After");
			System.out.println("          9. Delete Before");
			System.out.println("         10. Delete After");
			System.out.println("         11. Insert Sorted");
			System.out.println("         12. Linked List Concat");
			System.out.println("         13. Linked List Reverse");
			System.out.println("         14. Count Nodes");
			System.out.println("         15. Display Linked List");
			System.out.println("         16. Alternate Concat");
			System.out.println("         17. Even Odd Split");
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
					ll.insertFirst(d);
					//ll2.insertLast(d);
					break;
				}
				case 2:
				{
					System.out.println();
					System.out.print("Enter Data to Enter : ");
					int d = s.nextInt();
					ll.insertLast(d);
					break;
				}
				case 3:
				{
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.deleteFirst());
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 4:
				{
					System.out.println();
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.deleteLast());
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 5:
				{
					System.out.println();
					System.out.print("Enter Position to Enter Data : ");
					int pos = s.nextInt();
					System.out.print("Enter Data : ");
					int d = s.nextInt();
					ll.insertByPos(d, pos);
					break;
				}
				case 6:
				{
					System.out.println();
					System.out.print("Enter Position to Delete Data : ");
					int pos = s.nextInt();
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.deleteByPos(pos));
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 7:
				{
					System.out.println();
					System.out.print("Enter Key : ");
					int key = s.nextInt();
					System.out.print("Enter Data : ");
					int d = s.nextInt();
					ll.insertBefore(d, key);
					break;
				}
				case 8:
				{
					System.out.println();
					System.out.print("Enter Key : ");
					int key = s.nextInt();
					System.out.print("Enter Data : ");
					int d = s.nextInt();
					ll.insertAfter(d, key);
					break;
				}
				case 9:
				{
					System.out.println();
					System.out.print("Enter Data : ");
					int key = s.nextInt();
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.deleteBefore(key));
					break;
				}
				case 10:
				{
					System.out.println();
					System.out.print("Enter Data : ");
					int key = s.nextInt();
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.deleteAfter(key));
					break;
				}
				case 11:
				{
					System.out.println();
					System.out.print("Enter data to enter : ");
					int d = s.nextInt();
					ll.insertSorted(d);
					break;
				}
				case 12:
				{
					System.out.println("--------------------------------------------------------------");
					int choice;
					do {
						System.out.print("Enter Data to enter into Second Linked List : ");
						int d = s.nextInt();
						ll2.insertLast(d);
						System.out.println();
						System.out.println("Inserted Successfully");
						System.out.println();
						System.out.println("Do yo want to enter another data  : yes(1) No(0) ");
						choice = s.nextInt();
					}while(choice != 0);
					System.out.println("--------------------------------------------------------------");
					LinkedList LL;
					LL = ll.concat(ll2);
					System.out.println(LL.displayList());
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 13:
				{
					System.out.println("--------------------------------------------------------------");
					ll.reverse();
					System.out.println("LinkedList Reverse Successfully");
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 14:
				{
					System.out.println("--------------------------------------------------------------");
					System.out.println("Total No of Nodes : "+ll.countNode());
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 15:
				{
					System.out.println("--------------------------------------------------------------");
					System.out.println(ll.displayList());
					System.out.println(ll2.displayList());
					System.out.println("--------------------------------------------------------------");
					break;
				}
				case 16:
				{
					LinkedList LL = ll.concatAlt(ll2);
					System.out.println(LL.displayList());
					break;
				}
				case 17:
				{
					ll.spiltEO();
					break;
				}
				case 0:
				{
					System.out.println("Exited ");
					break;
				}
				default :
				{
					System.out.println("Enter Valid Choice");
					break;
				}
			}
			
		
		}
		while(ch != 0);

	}
}
