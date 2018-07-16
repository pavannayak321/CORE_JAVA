package oops_concept.overriding;
/*
 * WHILE OVERRIDING WE SHOULDN'T DECREASE THE SCOPE OF THE THE ACCESS MODIFIER IF WE WILL GET COMPILE TIME ERROR 
 */
class ScopeParent
{
	public void ma()
	{
		int x=456;
		System.out.println("hello this is PUBLIC-MODIFIER SCOPE");
	}
}
class ScopeChild extends ScopeParent
{
	/* void ma()
	{
		System.out.println("scope is reduced");
	}*/
}

public class OverridingScope {

	public static void main(String[] args) {
		

	}

}
/*
 * reason for the can't reduce the access level of modifiers for the   overriding method 
 * 
 * class Client2002
 * {
 * 		public void access() ------->everyone outside people are accessing the method  in year 2002
 * 		{
 * 			System.out.println();
 * 		}
 * 	}
 * 
 * class Clent2013
 * {
 * 		void access()
 * 		{
 * 			System.out.println("now the access level is reduced to <default> so ");------->outside people who already accessing is effected
 * 		}
 * 	}
 * 
 * 		
 * 
 * 
 */
