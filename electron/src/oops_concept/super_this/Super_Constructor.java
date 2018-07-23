package oops_concept.super_this;
class Test
{
	String name;
	
	Test(String name)
	{
		System.out.println(name);
	}
	Test(String name,int roll)
	{
		
	}
}

public class Super_Constructor extends Test {
	
	Super_Constructor(String name)
	{
		super(name);		//-->calls the parent class constructor 
		System.out.println("child-class-constructor");
	}
	Super_Constructor(String name,int roll)
	{
		super(name,roll);
		System.out.println("@two-param constructor");
	}
	
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Super_Constructor p = new Super_Constructor("pavan");
		Super_Constructor p1 = new Super_Constructor("pavan",123);
	}

}
