package oops_concept.overriding;
/*
 * we can't override the method which is declared as final  
 * 
 *
 */
class ParentFinal
{
	public final void parentfinal()
	{
		System.out.println("parent-final");
	}
	
	/*private methods are not visible in child classes so we can't override the parent class mathods in child if it is declared as private 
	 * */
	private void privatemeth()
	{
		System.out.println("hello");
	}
	 
}

class ChildFinal extends ParentFinal
{
	/*public void parentfinal()   //---->Cannot override the final method from ParentFinal
	{
		System.out.println("child-implementation");
	}
	*/
	
	
	public void   privatemeth()
	{
		System.out.println("hello-child-private");
	}
}
public class OverridingPrivate {
	
	public static void main(String[] args)
	{
		ParentFinal p = new 	ChildFinal();
		//p.privatemeth();   ----.The method privatemeth() from the type ParentFinal is not visible
	}

}
