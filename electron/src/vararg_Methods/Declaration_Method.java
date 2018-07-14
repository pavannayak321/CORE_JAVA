package vararg_Methods;


/*
 * NOTES----: var-arg concept came in 1.5 version of java 
 * 
 */

public class Declaration_Method {
	public static void m1(int... i)
	{
		System.out.println("Hello var-arg methods");
	}

	public static void main(String[] args) {
		
		m1(123,1237);
		m1(2340);
		m1(43);
	}

}
/*
 * OUTPUT:
 *  Hello var-arg methods
	Hello var-arg methods
	Hello var-arg methods
*/
