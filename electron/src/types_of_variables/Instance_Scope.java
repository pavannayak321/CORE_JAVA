package types_of_variables;
/*
 * instance_variable::------>if the value of object is varied from object to object then such type of 
 variable is called "Instance variable"
 */

public class Instance_Scope {
	 int x;
	
	 /*
		 * we can declare instance method but can't access
		 */
		public void m1()
		{
			System.out.println(x);
		}
	 
	 
	public static void main(String[] args)
	{
		Instance_Scope sc= new  Instance_Scope();
		System.out.println(sc.x);
	}
	
	

}
