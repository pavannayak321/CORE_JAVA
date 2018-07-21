package oops_concept.polymorphism; //----->[1.6]

/*
 * Process::--->	
 * whenever we are trying to execute a java class first that .class file should be loaded at the time of class loading the following actions will be performed 
 * automatically 
 * 
 * 
 * 1>INTIALIZATION OF THE STATIC MEMBER 
 * 
 * 2>EXECUTION OF STATIC VARIABLE AND ASSIGNMENT AND [STATIC BLOCKS] FORM TOP TO BOTTOM
 * 
 *  3>EXECUTION OF MAIN METHOD 
 */
class Test
{
static int y=12;
	
	static 
	{
		System.out.println(y);
		
	}
	
}
			

public class StaticControlFlow extends Test {
	
static int x=12;
	
	static 
	{
		System.out.println(x);
		System.exit(0);
	}
	
	
	
	public static void main(String[] args)
	{
		
	}

}
