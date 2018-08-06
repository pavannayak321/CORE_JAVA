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
