package operator_assignment;

public class PreIncrement_PreDecrement {
	
	public static void main(String[] args)
	{
		int x=12;
		int y=++x;
		/*
		 * x=12
		 * x=x+1;
		 * y=x;
		 */
		System.out.println(x+"value of y is "+y);
		
	
	int m=23;
	int n=m++;
	/*
	 * m=23
	 * n=m;
	 * m=m+1;
	 */
	System.out.println("value of n is" +n+"     "+"value of m is "+m);
	
	/*
	 * increment and decrement operator is not applicable for final variables 
	 */
	final int X=123;
	//int y=++X;
	/*
	 * The final field PreIncrement_PreDecrement.X cannot be assigned
	 */
	for(int i=0;i<=3;i++)
	{
		System.out.println("hello"+i);
	}
	
	}
	

}
