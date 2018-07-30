package innerclasses;
/*
 * sometimes we can declare a clas00s inside a method such type of classes are called 
 * 			"METHOD LOCAL INNER CLASSES"
 * the main Aim of declaring the method local inner classes is to define the method specific repeatedly required functionality
 * 
 * the scope of the method local inner class is in method in which we declared it 
 * 
 * 			from outside of the method we can't access the method local inner classes 
 * 
 * 			if your requirement is to  not to be used outside of the people then we should go for method local inner classes 
 */
class MethodOuter
{
	public void m1()
	{
		 class Inner
		{
			public void  sum(int x,int y)
			{
				System.out.println("the sum is  "+(x+y)); 
			}
			
		}
		Inner r = new Inner();
			  r.sum(10, 10);
			  r.sum(20, 20);
	}
}
public class Method_L_InnerClass {

	public static void main(String[] args) {
		
		MethodOuter outr = new MethodOuter();
					outr.m1();
		

	}

}
