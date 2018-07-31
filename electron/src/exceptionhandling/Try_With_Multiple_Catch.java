package exceptionhandling;

public class Try_With_Multiple_Catch {

	public static void main(String[] args) {
		try
		{
			System.out.println(2/0);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		/*
		 * multiple catch blocks 
		 */
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

	}

}
