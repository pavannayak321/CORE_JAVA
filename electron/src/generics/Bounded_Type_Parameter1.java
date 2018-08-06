package generics;

import java.lang.reflect.Method;

class Test
{
	public void ma()
	{
		System.out.println("hello");
	}
}

class Test1 extends Test
{
	public void ma2()
	{
		System.out.println("hi");
	}
}

public class Bounded_Type_Parameter1<T extends Test>
{
	T ob;
	Bounded_Type_Parameter1(T obj)
	{
		this.ob=obj;
		System.out.println("constructor is executing");
	}
	
	public void showDetails()
	{
		Class c=ob.getClass();
		Method[] m =c.getDeclaredMethods();
		for(Method s1:m)
		{
			System.out.println(s1.getName());
		}
	//System.out.println(ob.getClass().getName());
	}
	
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		Bounded_Type_Parameter1<Test1> tst1 = new Bounded_Type_Parameter1<Test1>(t);
		tst1.showDetails();

	}

}

