package oops_concept.typecasting;

/*
 * Because instance variables CANNOT be overridden in Java
 * 1. In Java only methods can be overridden.

When you declare a field with the same name as an existing field in a superclass, 
the new field hides the existing field. The existing field from the superclass is still present in the subclass, 
and can even be used ... subject to the normal Java access rules.


in overriding the method resolution is takes care by the compiler 

 */

class ParentInstance
{
	public int x=12;
}

class ChildInstance extends ParentInstance
{
}

public class TypeCastingInstance
{
public static void main(String[] args)
	{
	ChildInstance c = new ChildInstance();
	    System.out.println(c.x);
	}
}
