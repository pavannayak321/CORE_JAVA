/*
 * import java.util.*;
 *

class Test12<Integer>
{

Integer ob = new Integer(12);
Integer ob1=ob;

String str = new String("ello");

	public static  Test12 tes= new Test12();
		public void m1()
		{
		System.out.println(tes+""+ob);
		}
}
public class error
{
public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
				list.add("String");
				list.add("12");
			System.out.println(list);
			String str=(String)list.get(0);
				str=(String)list.get(1);
			
			//System.out.println(tes);
			Test12 td = new Test12();
				td.m1();

	}
}
Test.java:6: error: unexpected type
Integer ob = new Integer(12);
                 ^
  required: class
  found:    type parameter Integer
  where Integer is a type-variable:
    Integer extends Object declared in class Test12
1 error	
*/