/**
 * 
 */
/**
 * @author SAKKU JADAV
 * 
 * TYPE-CASTING::-->parent class reference can be used to hold child class  object 
 * Parent p = new Child();
 * 
 * similarly interface reference can be used to hold implemented class object 
 * 
 *  			====================
 *  			|					|
 *  			|A  b = (C) d		|
 *  			====================
 *  A---->interface\class 
 *  
 *  b----->reference variable 
 *  
 *  C----->class\interface
 *  
 *  d----->object reference
 *  
 *  compiler rule(1):=
 *  
 *  RELATIONSHIP BETWEEN C&d:::----->Parent - child relationship [otherwise we will get compile time error ] saying inconvertible types 
 *   ==========================================
 *   |Object o= new String("durga");		   |
 *   |										   |
 *   |StringBuffer sb   = new (StringBuffer)o; |
 *   |										   |
 *	 ==========================================
 *
 *
 *Compiler rule(2):
 *
 *		C must be of type class A or its Derived type
 *
 *runtime checking ::-->the underlying object type of d must be either same or derived type c .otherwise we will get runtime exception
 */
package oops_concept.typecasting;