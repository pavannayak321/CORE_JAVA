package types_of_variables;
/*
 * for local   variables JVM won't provide any default variables we have to explicitly  initialize the value 
 */

public class LocalVariableValues {

	public static void main(String[] args) {
		/*
		 * if we declared but not initialize x value   we will get compile time error
		 * the local variable x may not have been initialized 
		 */
		  int x=12;
		  System.out.println(x);
		

	}

}
