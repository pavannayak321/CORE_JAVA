package oops_concept.overriding;

/*
 * overriding concept is applicable only for methods but not for class 
 * 
 * ---->IF WE don't satisfy with the paren't class implementation class then we can implement the functionality in child class 
 * this concept is called overriding 
 * 
 */
class Parent
{
	public void m1()
	{
		System.out.println("MONEY+GOLD+CASH");
	}
	
	public void m2()
	{
		System.out.println("MARRY TO PRABANDHA");
	}
	
}

/*
 * ---------if person wants to accept the money came from the Parent class but don't want to marrry prabandha then he can override
 */
class Child   extends Parent
{
	public void m2()/*--->Overriding the method()-------*/
	{
		System.out.println("I DON'T WANT TO MARRY EARLY ");
	}
}

public class OverridingClass {
	
	 public static void main(String[] args)
	 {
		 Parent p = new Parent();
		 		/*
		 		 * runtime object is Parent  so jvm invokes the Parent class method();
		 		 * compiler always checks the class reference in which it contains method or not  
		 		 */
		 
		 Parent con = new Child();
		 		con.m2();
		 		/*
		 		 * here runtime object is Child()  so jvm checks for the child class contains the verrideng method if it finds 
		 		 * then overridden method will be executed 
		 		 */
	 }

}
