package oops_concept.overriding;
/*
 * 
 */
class Non_abstarct_Class
{
	protected  void ma()
	{
		System.out.println("hello-implemented_class");
	}
}

abstract class Abstract_class
{
	public abstract void ma();	
}


public class OverrideNonAbstract_TO_Abstract {
	public static void main(String[] args)
	{
		Non_abstarct_Class p = new  Non_abstarct_Class();
							p.ma();
	}
	
   }
