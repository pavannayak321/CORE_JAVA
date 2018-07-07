package basic_datatypes;

public class Byte_Value {
	public static void main(String[] args)
	{
		/*
		 * maximum allowed  value in byte is bits 
		 * [0][1][1][1][1][1][1][1]---->127
		 * 
		 */
		byte b=123;
		System.out.println(b);
		byte b1=125;
		System.out.println(b1);
		/*
		 * trying to access the value 128
		 */
		//byte b3=128;
		//System.out.println(b3);
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from int to byte

	at basics.Byte_Value.main(Byte_Value.java:18)

		 */
	}

}
