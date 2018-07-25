package lang.wrapper;
/*
 * 			==================================
 * 			|public  static Wrapper valueOf();|
 * 			==================================
 * 		
 * 		(1)	valueOf()is used for converting the  String--->Wrapper(Object)
 * 
 * 		(2)	valueOf() is used for converting the primitive value to the Wrapper(Object)
 * 				==============================================
 * 				|public static Wrapper valueOf(Primitive prm);|
 * 				==============================================
 */

public class Value_Of_Method {
	
	public static void main(String[] args)
	{
		int x=14;
		String s="12";
		Integer i =Integer.valueOf("12");		//-->converting the[ String --> Integer] object 
		Integer i2=Integer.valueOf(x);
		Integer i3=Integer.valueOf(s);
		System.out.println(i2.getClass().getName());
		System.out.println(i3);
		
	}

}
