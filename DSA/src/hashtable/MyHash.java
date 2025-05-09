package hashtable;

import java.util.Scanner;

import stack.Student;

public class MyHash {

	private Record_Info [] table;
	
	public MyHash()
	{
		table = new Record_Info [10];
		for(int i=0; i<10; i++)
		{
			table[i] = new Record_Info();
			table[i].setStatus(Record_Info.record_type.EMPTY);
		}
	}
	
	public MyHash(int n)
	{
		table = new Record_Info [n];
		for(int i=0; i<n; i++)
		{
			table[i] = new Record_Info();
			table[i].setStatus(Record_Info.record_type.EMPTY);
		}
	}
	
	public int hash(int rno)
	{
		return rno % 10;
	}
	
	public void insert(Student s)
	{
		int key = hash(s.getRno());
		
		if(table[key].status == Record_Info.record_type.OCCUPIED && table[key].ref.getRno() == s.getRno())
		{
			System.out.println("Cannot insert Duplicate");
			return;
		}
		
		if(table[key].status == Record_Info.record_type.EMPTY || table[key].status == Record_Info.record_type.DELETED)
		{
			table[key].ref = s;
			table[key].setStatus(Record_Info.record_type.OCCUPIED);
			return;
		}
		
		for(int i=key; i<table.length; i++)
		{
			if(table[i].status == Record_Info.record_type.EMPTY || table[i].status == Record_Info.record_type.DELETED)
			{
				table[i].ref = s;
				table[i].setStatus(Record_Info.record_type.OCCUPIED);
				return;
			}
		}
	}
	
	public int search(int r)
	{
		int key = hash(r);
		
		if(table[key].getStatus() == Record_Info.record_type.EMPTY)
		{
			System.out.println("Record Not Found");
			return -1;
		}
		
		for(int i=key; i<table.length; i++)
		{
			if(table[i].ref.getRno() == r)
			{
				if(table[i].status == Record_Info.record_type.OCCUPIED)
					return i;
			}
		}
		
		return -1;
	}
	
	public int delete(int r)
	{
		int key = hash(r);
		
		if(table[key].getStatus() == Record_Info.record_type.EMPTY)
		{
			System.out.println("Record Not Found");
			return -1;
		}
		
		for(int i=key; i<table.length; i++)
		{
			if(table[i].ref.getRno() == r)
			{
				if(table[i].status == Record_Info.record_type.OCCUPIED)
				{
					table[i].setStatus(Record_Info.record_type.DELETED);
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public void display(int r)
	{
		int key = hash(r);
		
		if(table[key].getStatus() == Record_Info.record_type.EMPTY)
		{
			System.out.println("Record Not Found");
			return ;
		}
		
		for(int i=key; i<table.length; i++)
		{
			if(table[i].ref.getRno() == r)
			{
				if(table[i].status == Record_Info.record_type.OCCUPIED)
				{
					System.out.println(table[i].ref);
					return;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		MyHash h = new MyHash();
		Scanner s = new Scanner(System.in);
		Student stud;
		for(int i=0; i<2; i++)
		{
			System.out.print("Enter Student Roll No : ");
			int rno = s.nextInt();
			
			stud = new Student("", rno, 0, 0.0f); 
			h.insert(stud);
			
		}
		
		h.display(10);
		h.display(45);
	}
	
}
