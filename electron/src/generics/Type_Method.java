package generics;

import java.awt.List;
import java.util.ArrayList;

class Student1<T>
{
	
}
/*
 * we have to declare the type parameter just before the return type of method
 * 
 * 		public static <T>void print_name()
 *		{
 *			------------------
 *			------------------
 *			------------------
 *		}
 */
class ReturnType<Student>//---------Student s = new Student();----possible 
{
	public   <X extends Number> String   ma(Student1<? extends Number>   string)////////IIMPIMPIMPIMMPIMPIMPIMPIMP//////
	{
		Student s;
		System.out.println("hello");
		return "ewew";
	}
	
	
	
	public String hello()
	{
		return "123";
	}
}
class Student
{
	public void  data()
	{
		System.out.println("h1h2h3");
	}
}
public class Type_Method {

	public static void main(String[] args) 
	{
		Student s = new Student();
		String val="12";
		ReturnType v= new ReturnType();
					//v.<Integer>ma(464);----->
		//he method ma(Student1) in the type ReturnType is not applicable for the arguments (int)	
				

	}

}
