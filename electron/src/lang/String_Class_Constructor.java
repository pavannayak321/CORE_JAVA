package lang;
/*
 * String s= new String();
 * 
 * String s = new String(String constant);
 * 
 * String s= new String(StringBuffer bf)
 * 
 * String s= new String(Char[] ch)
 * 
 * String  s= new String(Byte[] b);
 */

public class String_Class_Constructor {
	
	public static void main(String[] args)
	{
		String s = new String();
		System.out.println(s.length());
		/*
		 * 
		 */
		String s1= new String("pavan");
		System.out.println(s1);
		/*
		 * 
		 */
		String sb = new String(new StringBuffer("stingbuffer"));
		System.out.println(sb);
		/*
		 * 
		 */
		byte[] b ={12,12,23,34,45,56};
		String s2 = new String(b);
		System.out.println(s2);
		/*
		 * 
		 */
		char[] ch= {'a','b','c','d','e'};
		String s3 = new String(ch);
		System.out.println(s3);
		
	}

}
