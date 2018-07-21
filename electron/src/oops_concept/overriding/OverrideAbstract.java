package oops_concept.overriding;
/*
 * if parent class contains the abstract methods then we should override the method in child classes to provide implementation to that 
 * 
 */
abstract class ParentAbstarct
{
	public abstract void m1();
}

/*
 * overriding the ParentAbstract class to provide implementation
 */
 class ChildAbstract	extends ParentAbstarct
{
	public void m1()
	{
		System.out.println("abstract child class implementaation with abstract declared at class level");
	}
}

 public class OverrideAbstract {
	public static void main(String[] args)
	{
		ParentAbstarct p= new 	ChildAbstract();
				p.m1();
	}

}
