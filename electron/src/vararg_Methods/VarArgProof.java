package vararg_Methods;

/*
 * in this method we will  prove  the var_arg method  is  implementation of one dimensional array
 * VALID CASE OF SINGLE DIMENSIONAL PARAMETER--->VAR-ARG METHOD 
 * m1(int[] x)---------->m1(int... x)_/
 * m1(String[] x)------->m1(String... X)_/
 * 
 *  
 *  INVALID PROMOTION-----:>m1(int... x)------->m1(int[] x)
 */

public class VarArgProof {
	
	//public void m1(int[] x)
	//{
		
	//	System.out.println("it is of type int[] x");
	//}
	
	/*
	 * Duplicate method m1(int...) in type VarArgProof
	 */
	public void m1(int... x)
	{
		System.out.println("it is of type int... x");	
	}
	
	
	
	public static void main(String[] args)
	{
		
	}

}
