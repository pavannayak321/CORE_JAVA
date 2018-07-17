package oops_concept.overriding;

/*
 * we can't override a static method as in  non static area 
 * if we then we will get compile time error saying 
 * method m1() in C cannot overridden method m1() in P overridden method is static 
 */
class ParentStatic
{
	public static  void m1()
	{
		System.out.println("static-method");
	}
}


class StaticInstance extends 	ParentStatic
{
	/*
	 * This instance method cannot override the static method from ParentStatic
	 */
		/*public void m1()   
			{
				System.out.println("non-static-method");
			}
		 */
}

public class StaticOverriding {
	public static void main(String[] args)
	{
		ParentStatic	 obj = new StaticInstance();
		obj.m1();
		
	}
	

}
