package lang;
import java.lang.reflect.Method;

import lang.To_String_Method;
/*
 * 		
 */

public class GetClass_Method {
	

	public static void main(String[] args) {
		To_String_Method p = new To_String_Method("pavan",123);
		int count=0;
		Class c=p.getClass();
		Method[] m =c.getDeclaredMethods();
		
		for(Method m1:m)
		{
			System.out.println(m1.getName());
			count++;
			
		}
		System.out.println(count);

	}

}
