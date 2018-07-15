package oops_concept;
/*
 * A class is said to be tightly encapsulated iff every data member declared as the private in that class 
 * 				------>whether  a class contain the getter and setter method or not 
 * 						 whether those methods declared as the public and private ot=r not these are all not required to check 
 *  
 */

public class TightlyEncapsulatedClass {
	
	private int balance;
	
	   			public int getIntBalance()
	   			{
	   				return balance;
	   			}

}
/*
 * EXAMPLE FOR THE TIGHTLY ENCAPSULATED CLASS :
 * -------------------------------------------:		class A
 * 													{
 * 															private int x=123;
 * 															private int min=12;
 * 														public void setter()
 * 														{
 * 															--------------
 * 															-------------
 * 															--------------
 * 														}
 * 	
 * 													class C  extends  A
 * 													{
 * 															private int minmax=1233;
 * 															private double kij=12332;
 * 													}
 */
