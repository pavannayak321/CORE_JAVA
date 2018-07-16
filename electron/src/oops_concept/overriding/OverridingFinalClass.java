package oops_concept.overriding;
/*
 * we can't override parent class methods which is declared as final but we can extend it to the child class inheritance concept is applicable
 * private methods are not visible to the child classes so inheritance concept is not applicable for the pprivate  methods()
 */

class   FinalParent
{
	public final  void m1()
	{
		System.out.println("final-parent");
	}
}

class FinalChild extends FinalParent
{
	
	/*public final void m1()
	{
		System.out.println("child-class final");
	}
	*/
}

public class OverridingFinalClass {
	
	public static void main(String[] args)
	{
		FinalParent p = new FinalChild();
					p.m1();
					
		
	}

}
