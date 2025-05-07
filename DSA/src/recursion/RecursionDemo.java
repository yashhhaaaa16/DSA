package recursion;

public class RecursionDemo {

	
	//--------------------------Array Display--------------------//
	
	public static void display(int a[], int i)
	{
		if(i>a.length-1)
			{System.out.println();
			System.out.print("Reverse"+" - ");
			return;}
		if(i==0)
		{System.out.print("Forward"+" - ");}
		System.out.print(a[i]+ " ");
		display(a, i+1);
		System.out.print(a[i]+ " ");
	}
	
	//--------------------------Sum of Array---------------------//
	
	public static int sum(int []a,int i)
	{
		if(i>9) 
		return 0;
	//	System.out.println(a[i]);
		return a[i] + sum(a,i+1); 
	}
	
	//--------------------------Count no of Digit----------------//
	
	public static int cnt(int n) 
	{
		if(n/10 == 0)
			return 1;
		return 1 + cnt(n/10); 
	}

	//--------------------------Sum of Digit-------------------//
	
	public static int sum(int n)
	{
		if(n/10 == 0)
			return n;
		return n%10 + sum(n/10);
	}
	
	//--------------------------Power of Digit-------------------//
	
	public static int power(int a, int p)
	{
		if(p==0) 
			return 1;
		return a * power(a,p-1);
	}
	
	//--------------------------Display Digits-------------------//
	
	public static void displayDigit(int n)
	{
		if(n/10 == 0)
			{System.out.print(n);
			return ;}
		System.out.print(n%10 +" ");
		displayDigit(n/10);
		
		
	}
	
	//---------------------------Pattern-------------------------//
	
	public static void star(int n)
	{
		if(n==0)
			return;
		System.out.print("*");
		
		star(n-1);
	}
	
	public static void displayStar(int n)
	{
		if(n == 0)
			return;
		displayStar(n-1);
		System.out.println(" ");
		star(n);
	}
	
	//--------------------------Odd Even-------------------//
	
	public static void fun1(int n)
	{
		
		System.out.println("fun 1 - "+n);
		fun2(n+1);
	}
	
	public static void fun2(int n)
	{
		
		System.out.println("fun 2 - "+n);
		if(n>25)
			return;
		fun1(n+1);
	}
	
	public static void main(String[] args) {
		
		//int arr[] = {10,20,30,40,50,60,70,80,90,100};
		//display(arr,0);
		//System.out.println(sum(arr,0));
		//System.out.println(cnt(145263));
		//System.out.println("Sum = "+sum(13245));
		//System.out.println("5 Power 3 = " +power(5,3));
		//displayDigit(13246546);
		//displayStar(5);
		fun1(1);
	}
}
