package oops_concept.overriding;
/*
 * the parent class abstract method we should implement in sub class 
 */

 abstract class Abstract
{
	public void method()
	{
		System.out.println("");
	}
	public abstract  void m2();
}
 
 class AbstractImpl extends Abstract
 {
	 public void m2()
	 {
		 System.out.println("----");
	 }
	 
	 
 }

public class ParentAbstract {

	public static void main(String[] args) {
		

	}

}
