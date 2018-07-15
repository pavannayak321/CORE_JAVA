package oops_concept;

class Animal
{
	/*
	 * -----------
	 * -----------
	 * -----------
	 */
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
									t.m1(anml);  /*----aanimal m1() will be called   ----*/
				Monkey mnky  = new Monkey();
				
									t.m1(mnky);  /*--- monkey version will be called ------*/
									
									 
				Animal an = new Monkey();
				          t.m1(an); /*parent refence can be used to hold child object but parent metho() only we can access */
	}

}
