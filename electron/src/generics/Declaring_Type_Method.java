package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Hi in this  tutorial i  cover the basics of the [method type parameter] in java 
 */
class MethodDeclaration
{
	/*
	 * -------------------------------------------------
	 * -------------------------------------------------
	 */
	public <X extends Number> void  setMarks(X marks)
	{
		X marks1=marks;
		System.out.println(marks1);
	}
	/*
	 * -------------------------------------------------
	 * -------------------------------------------------
	 */
	public static void showList(List<? extends String> names)
	{
		for(String s2:names)
		{
			System.out.println(s2);
		}
		
	}
	/*
	 * package generics;

class Box<T>
{
	private T t;
	
	public void add(T t)
	{
		this.t=t;
	}
	public T get()
	{
		System.out.println(t);
		return t;
	}
}
public class GenericDemoo {

	public static void main(String[] args) 
	{
		Box b = new Box();
			b.add(new String("hello"));//----=----//---=---//->>method inference 
			b.get();

	}

}
------------------------------------------------------------------------------
------------------------------------------------------------------------------
------------------------------------------------------------------------------
Raw types show up in legacy code because lots of API classes (such as the Collections classes) were not generic prior to JDK 5.0. When using raw types, you essentially get pre-generics behavior — a Box gives you Objects. For backward compatibility, assigning a parameterized type to its raw type is allowed:

Box<String> stringBox = new Box<>();
Box rawBox = stringBox;
	 */
}
public class Declaring_Type_Method 
{
	

	public static void main(String[] args)
	{
		
		MethodDeclaration mrks = new MethodDeclaration();
							mrks.setMarks(123);
							List<String> name=new ArrayList<String>();
										name.add("pavan");
										name.add("nayak");
										mrks.showList(name);
							List<Integer> l = new ArrayList<Integer>();
										l.add(12);
										//mrks.showList(l);---The method showList(List<? extends String>) 
										//in the type MethodDeclaration is not applicable for the arguments (List<Integer>)
	}

}
