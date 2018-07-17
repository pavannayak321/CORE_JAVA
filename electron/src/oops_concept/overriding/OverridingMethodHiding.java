package oops_concept.overriding;

/*
 * if parent class is static and child class is static then we won't get any compile time error 
 * and it seems to be overriding but it is not overriding 
 * it is method hiding  
 */
 class ParentMethodHiding
{
	 public static void m1()
	 {
		 System.out.println("static-method()");
	 }
	
}
 class ChildMethodHiding
 {
	 public static void m1()	/* it seems to be overriding but it is not overriding it is method hiding()   */
	 {
		 System.out.println("static-method2()");
	 }
 }

public class OverridingMethodHiding {

	public static void main(String[] args) {
		
		ChildMethodHiding p = new  ChildMethodHiding();
						  p.m1();	 /*  method hiding call()    */
		
		

	}

}
