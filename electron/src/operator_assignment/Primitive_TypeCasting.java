package operator_assignment;

/*
 *@Typecasting of two types 
 *1>IMPLICIT TYPECASTING
 *2>EXPLICIT TYPECASTING
 */

public class Primitive_TypeCasting {
	
	public static void main(String[] args) {
		/*
		 * implicit TypeCasting 
		 */
		double d=12;
		System.out.println(d);
		
		/*
		 * explicit TypeCasting
		 */
		int  b=129;
		byte bi=(byte)b;
	System.out.println(bi);//------>Here loss of information occurred 
		

	}

}
