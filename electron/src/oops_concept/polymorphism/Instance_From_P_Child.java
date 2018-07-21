/**
 * 
 */
package oops_concept.polymorphism;

/**
 * whenever we are creating the child class object the following sequence of events will be performed automatically 
 * 
 * (1)identification of instance member from parent class to child class 
 * 
 * (2)execution of instance variable assignments&instance blocks from the top-bottom in the Parent class only 
 * 
 * (3)execution of constructor in Parent class only 
 * 
 * (4)execution of instance variable assignments&instance blocks from the top-bottom in the Child  class only 
 * 
 * (5)execution of the constructor in child class 
 */


class Parent
{
	int x=10;
	
	{
		m1();
		System.out.println("parent");
	}
	
	Parent()
	{
		System.out.println("parent-class-constructor");
	}
	
	public static void main(String[] args)
	{
		Parent p = new Parent();
		System.out.println("Parent_main()");
	}
	
	public void m1()
	{
		System.out.println(y);
		
		
	}
	int y=123;
		
	
}
public class Instance_From_P_Child extends Parent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
