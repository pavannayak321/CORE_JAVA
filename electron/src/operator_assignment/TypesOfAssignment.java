package operator_assignment;
/*
 * types of assignment operator 
 * 1)simple assignment operator 
 * 2)chained assignment operator 
 * 3)compound assignment operator 
 */

public class TypesOfAssignment {
	
	
	public static void main(String[] args)
	{
		/*
		 * SIMPLE ASSIGNMENT 
		 */
		int x=23,y=43;
		y=x;
		System.out.println(y);
		/*
		 * CHAINED ASSIGNMENT OPERATOR:::--->
		 * int a=b=c=d=123;----->NOT POSSIBLE  
		 * in case of chained assignment operator the we can't assign the value at the time of declaration only 
		 */
		//int a=b=c=d=123;
		//System.out.println(b);-------->[b cannot be resolved to a variable]
		/*
		 * COMPOUNT ASSIGNMENT OPERATOR:::--->
		 * Sometimes we can mix some assignment operator with other operator to form compound assignment operator
		 */
		byte  a=12;
		a+=12;
		System.out.println(a);
		
	}

}
