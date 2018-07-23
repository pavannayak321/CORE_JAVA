package lang;
import  oops_concept.polymorphism.SingleTonClass;
/*
 * clone()---->the process of creating the exactly duplicate Object is  
 * 
 * 		the main objective of clone() is to maintain the exact duplicate copy of the object 
 * 
 * 		clone() throws ClassNotSupportedException
 * 
 * 		protected native Object clone() throws [CloneNotSupportedException]
 */

public class Clone_Object  implements Cloneable
{
			String name="pavan";
			int roll;
			
			Clone_Object(String name)
			{
				this.name=name;
			}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		Clone_Object obj1 = new Clone_Object("nayak");
		Clone_Object obj3 = new Clone_Object("nayak123");
		//System.out.println(obj2.name);
		System.out.println(obj3.name);
		
		Clone_Object	obj2=(Clone_Object)obj1.clone();
		SingleTonClass cln =new SingleTonClass();
		//SingleTonClass tn=(SingleTonClass)cln.clone();------>The method clone() from the type Object is not visible
		
		
	}

}
