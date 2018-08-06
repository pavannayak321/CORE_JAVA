package collections;
import java.util.*;
/*
 * list is the child interface of the collection interface 
 * --->if we want to represent the group of the objects where insertion order is preserved 
 * 		and duplicates are allowed 
 * 
 * new capacity =3\2+1;
 * 
 */
final class Test{
	
	
	public final String  toString()
	{
		return "Test";
	}
	
}
/*
 * 
 */
	class Student123{
		
		public final String  toString()
		{
			return "Student123";
		}
		
		
		public void m2()
		{
			System.out.println("hello mmck");
		}
	}



public class ArrayList_Class {

	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		Test t = new Test();
		Student123 s = new Student123();
		
					l.add(24);
					l.add(12.435);
					l.add("2");
					l.add("hfygfrygfyr");
					l.add(null);
					l.add(s);
					l.add(t.getClass().getName());
					System.out.println(l.get(6));
					Test t2 =(Test)l.get(6);		//class cast exception???????????

	}

}
