package lang;

/*
 *           the toString() method returns the string representation of the object.
 *  	   	 If you print any object, java compiler internally invokes the toString() method on the object.
 *  		 So overriding the toString() method, returns the desired output,
 * 			 it can be the state of an object etc. depends on your implementation.
 * 
 * 
 * 
 * 				internally Object class toString() is implemented based on toString() method 
 * 				syntax::
 * 
 * 						public String toSitring()
 * 							{
 * 								
 * 								return getClass.getName()+"@"+Integer.toHexString(hashCode);
 * 							}
 */

public class To_String_Method {
	
	String name;
	
	int roll;
	
	To_String_Method(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public void m1()
	{
		
	}
	

	
	public static void main(String[] args)
	{
		To_String_Method p = new To_String_Method("pavan",123);
		Runtime r;
		//int p1=r.availableProcessors();
		//System.out.println(p1);
		
	}
}
/*
 * internal implementation of the java.lang.toString()
 * 
 * 				public String  toString()
 * 				{
 * 				return getClass().getName()+"@"+Integer.toHexString(hashCode);
 * 				}
 * in String,StringBuffer & in all wrapper classes toString() method is overridden to return the 
 * 			proper string form 
 * hence it is highly recommended to override the toString() method in our own class 
 */
