package exceptionhandling;

/*
 * throwable class defines the following methods to print the exception information
 * 1)toString()
 * 
 * 2)printStackTrace()			------>default exception handler uses this method to print the exception message to console.
 * 
 * 3)getMessage()
 */

public class Methodds_To_Print_Exception 
{
	public static void main(String[] args)
	{
		try {
			
			System.out.println(2/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is toString()format");
			System.out.println(e.toString());
		}
		/*
		 * getMessage()
		 */
		int[][] a =new int[3][];
		try {
		System.out.println(a[0][0]);
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		/*
		 * printStackTrace()
		 */
		try
		{
			System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
