package main_method;
/*
 * if child  class doesn't contain main method and extends parent class then parent class main() will be executed 
 */
class Parent{
	public static void main(String...strings ) {
		System.out.println("strings");
		Inherit_MainMethod  inhmethod = new Inherit_MainMethod();
		inhmethod.ma();
		
	}
	/*
	 * Syntax error on token ".", @ expected after this token
	 */
	//System.out.println("j");
	
}

public class Inherit_MainMethod  extends Parent{
	
	public void ma()
	{
		System.out.println("j");
	}
	
}
/*
strings
*/