package stack;

public class Student {

	protected String name;
	protected int rno, age;
	protected float fees;
	
	public Student()
	{
		name = "Yash";
		rno = 34;
		age = 24;
		fees = 106000;
	}

	public Student(String name, int rno, int age, float fees) 
	{
		this.name = name;
		this.rno = rno;
		this.age = age;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rno=" + rno + ", age=" + age + ", fees=" + fees + "]";
	}
	
	
	
}
