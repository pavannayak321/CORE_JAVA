package oops_concept.typecasting;


class Parent
{
	public void m1()
	{
		System.out.println("Parent-method()");
	}
}



class Middle extends Parent
{
	public void m1()
	{
		System.out.println("moddle-method()");
	}
	public void middle()
	{
		System.out.println("c");
	}
}



class Child  extends Middle
{
	public void m1()
	{
		System.out.println("child-method()");
	}
	public void child()
	{
		System.out.println("c");
	}
}




public class TypecastingClass {
	
	public static void main(String[] args)
	{
		Parent p = new Child();
		Middle m=(Middle)p;   //safe type casting 
			   //m.child();   -->
	}

}
