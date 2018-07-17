package oops_concept.overriding;
/*
 * if we try to override to var-arg class with normal class the it will become the overloading
 * 
 * ----->ILF WE TRY TO OVERRIDE IT WILL BECOME THE OVERLOAADING METHOD()   but not overriding 
 * 
 * ----->a var-arg method should override with var-arg method() only 
 * 
 *  			class Parent
 *  				{
 *  					public void m1()
 *  					{
 *  						---------
 *  						---------
 *  						---------
 *  					}
 *  
 *  				}
 *  
 *  			class Child extends Parent
 *  				{
 *  					public void m1(int... x)-------->don't know how-much arg we pass to this method()   
 *  					{
 *  						---------------
 *  						--------------
 *  					}
 *  				}
 *  public class VarargsOverrideDEmo
 *  		{
 *  			public static void main(String[] args)
 *  			{
 *  				Parent p = new Child();
 *  					p.m1();---------->
 *  
 *
 */
class ParentVAr_arg
{
	public void m1(int x)
	{
		System.out.println("single argument ");
	}
	
}
class ChildVar_arg extends ParentVAr_arg
	{
		public void m1(int...is)
		{
			System.out.println("var-arg method()");
		}
	}


public class Overriding_VarArg {

	public static void main(String[] args) {
		ParentVAr_arg p = new ChildVar_arg();
		
					p.m1(12);
	}

}
