package vararg_Methods;
/*
 * accessing the value passed to the var_arg method 
 * internally ver_arg method is implemented based on array types 
 */

public class VarArg_AccessValues {
	
	
	public static  void m2(int... x)
	{
		int total=0;
		
		for(int j:x)	
		{
			total=total+j;
		}
		System.out.println(total);
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		m2(123,32,45);
		m2(43,67,98,678);
	}

}

/*
 * 
 * OUTPUT:
 * 				200
				886
*/
