package lang.wrapper;
/*
 * the main Objective of the wrapper classes are to 
 * 
 * 
 * 		(1)to wrap primitives into object form ,so that we can handle primitives just like objects 
 * 
 * 		(2)to define several utility methods for primitives 
 * 
 * 		=::CONSTRUCTION OF WRAPPER CLASS OBJECTS:::=
 * 			all most all wrapper classes contains two constructors 
 * 				(1) one can take corresponding Primitive as argument 
 * 				
 * 				(2)one can take String as the arguments 
 * 
 * 
 * 					Integer i= new Integer("12f");
 * if String is not  properly formatted then we will get R.E saying [NUMBERFORMATEXCEPTION]
 */

public class WrapperClasses {

	public static void main(String[] args) {
		Integer i = new Integer("12");
		Integer i1 = new Integer(12);
		System.out.println(i+12);
		System.out.println(i1+12);
		
		

	}

}
