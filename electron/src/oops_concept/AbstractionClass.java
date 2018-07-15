package oops_concept;
/*
 * ABSTRACTION:::--->
 * 						hiding the internal implementation details and and just highlight the set of services what we are offering to 
 * the end user is called   "ABSTRACTION"
 * 
 * eg:= 
 * 			by Bank ATM machine ,bank people highlight the set of the services what they are providing without highlighting the  
 * 			internal implementation
 * 				this concept nothing but "ABSTRACTION"
 * 
 * ->by using the interface and ABSTRACTION we can achieve the 
 */

public class AbstractionClass {

}
/*
 * ---------------------------------SERVER SIDE CODE  HIDED FROM THE CLIENT ---------------------------------------
 * 
 * 
 * 	public abstract  class Electronics 
 * 				{
 * 					boolean powerOn=false;
 * 
 * 
 * 					public void turnOn()
 * 					{
 * 						powerOn=true;
 * 						System.out.println("turn on");
 * 					}
 * 
 * 				
 * 					public void turnOff()
 * 						{
 * 							powerOn=false;
 * 						System.out.println("power is off");
 * 						}
 * 				........delivering the choice to the client side ...........
 * 
 * 					public abstract void generate();
 * 
 * 				............................................................
 * 
 * 
 * 
 * -------------------------------------------HIGHLIGHTING THE CLIEN'T SIDE SERVICES------------------------------------
 * 
 * 				public class Tester extends Electronics
 * 					{
 * 						public void operate()
 * 							{
 * 								----------------
 * 								----------------
 * 								----------------
 * 								----------------
 * 							}
 * 
 * 
 * 				public class IPad extends Electronics
 * 							
 * 							public void operate()
 * 							{
 * 								----------------
 * 								----------------
 * 								----------------
 * 								----------------
 * 							}
 * 
 * 
 * 					
 */
