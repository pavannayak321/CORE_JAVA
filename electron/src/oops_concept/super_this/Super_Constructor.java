package oops_concept.super_this;
class Test
{
	String name;
	Test(String name)
	{
		System.out.println(name);
	}
}

public class Super_Constructor extends Test {
	
	Super_Constructor(String name)
	{
		super(name);		//-->calls the parent class constructor 
		System.out.println("child-class-constructor");
	}
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		Super_Constructor p = new Super_Constructor("pavan");
	}

}
