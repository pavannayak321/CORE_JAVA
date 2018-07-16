package oops_concept;

class Animal
{
	static  public int x=12;
	/*
	 * -----------
	 * -----------
	 * -----------
	 */
	static public void mwe(Animal anl)
	{
			System.out.println("hello");
	}
	
}

class Monkey extends Animal
{
	/*-------------
	 * ------------
	 * ------------
	 */
}




public class Overloading_ClassReference {
	
	public void m1(Animal a)
	{
		a.x=62;
		System.out.println("Animal-version");
		
		
	}
	
	public void m1(Monkey m)
	{
		System.out.println("monkey version");
	}
	
	
	public static void main(String[] args)
	{
		Overloading_ClassReference t = new Overloading_ClassReference();
				Animal anml = new Animal();
									t.m1(anml);  /*----animal m1() will be called   ----*/
				Monkey mnky  = new Monkey();
				
									t.m1(mnky);  /*--- monkey version will be called ------*/
									
									 
				Animal an = new Monkey();
				          t.m1(an); /*parent refence can be used to hold child object but parent metho() only we can access */
	}

}
