package lang.wrapper;
/*
 * we use the  	 xxxValue() 		is used for converting the Wrapper  objects to the Primitive objects 
 */

public class XxxValue_Method {

	public static void main(String[] args) {
		
		Integer i1 = new Integer("12");
			/*
			 * converting the Wrapper object---->primitive value
			 */
		System.out.println(i1);
		int x=i1+12;
		int x1=12+23;
		
		
		System.out.println(x);
		System.out.println(x1);
		

	}

}
