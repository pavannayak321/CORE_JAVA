package innerclasses;
/*
 * class which is declared inside another which is not static such type of class is called 
 * "NORMAL OR GREGULAR CLASSES"
 * 
 */
class Outer
{
	class InnerStatic_Method
	{
		/*
		 *  inside inner classes we can't declare static members hence it is not possible to declare a main method in inner classes 
		 * and we can't invoke directly the inner class 
		 */
		public  void man(String[] args) // if we declare as static 
		{
			System.out.println(args[0]);
			//C:E==The method main cannot be declared static; static methods can only be declared in a static or top level type
		}
		
		/*
		 * accessing the inner class code from the static area of the outside class  
		 */
	}	
		public static void main(String[] args)
		{
			Outer oter = new Outer();
			Outer.InnerStatic_Method inr= oter.new 	InnerStatic_Method();
							inr.man(new String[] {"pavan","nayak"});
		}
	
}
public class Regular_Inner_Class {

	public static void main(String[] args) {
		

	}

}
