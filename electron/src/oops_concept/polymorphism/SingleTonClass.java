package oops_concept.polymorphism;
/*
 * SINGLETON_CLASS::=
 * 					-->for any java class if we are allowed to create only one class object and then created class object is shared whenever 
 * 							it is requested is called  'singleton_class'
 * 
 * 					-->SYNTAX:
 * 					
 * 							class Test
 * 							{
 * 								private static Test t = new Test(); //-->outside person can't access it's object 
 * 							private Test()
 * 							{
 * 							}
 * 		
 * 								public static Test getTest()
 * 								{
 * 									return t;
 * 								}
 * 							}
 */


							class Test12
							{
 							private static Test12 t = new Test12(); //-->outside person can't access it's object 
 							
 							private Test12()
 							{
 								System.out.println("hello");
 							}
 		
 								public static Test12 getTest()
 								{
 									return t;
 								}
 							}

public class SingleTonClass {
							
				

	public static void main(String[] args) {
		Test12 t =Test12.getTest();
		

	}

}
