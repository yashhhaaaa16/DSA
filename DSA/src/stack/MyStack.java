package stack;

import java.util.Scanner;

public class MyStack {
	public static void main(String[] args) {

		//IntStack is = new IntStack();
		StudStack ss = new StudStack(2);
		int ch;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("===== MENU =====");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. isEmpty");
			System.out.println("5. isFull");
			System.out.println("0. Exit");

			System.out.println("Enter Your Choice : ");
			ch = s.nextInt();

			switch (ch) 
			{
				case 1: 
				{
					System.out.println("Enter Student Name : ");
					String name = s.next();
					System.out.println("Enter Student Age : ");
					int age = s.nextInt();
					System.out.println("Enter Student RollNo : ");
					int rno = s.nextInt();
					System.out.println("Enter Student Fees : ");
					float fees = s.nextFloat();
										
					Student s1 = new Student(name,rno,age,fees);
					ss.push(s1);
					break;
				}
				case 2:
				{
					System.out.println(ss.pop());
					break;
				}
				case 3: 
				{
					System.out.println(ss.peek());
					break;
				}
				case 4: 
				{
					System.out.println(ss.isEmpty());
					break;
				}
				case 5: 
				{
					System.out.println(ss.isFull());
					break;
				}
			}
		} while (ch != 0);
	}

}
