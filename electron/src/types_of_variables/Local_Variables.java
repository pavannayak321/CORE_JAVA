package types_of_variables;
/*
 * Local Variables:=
 * sometimes to meet programmer temporary  requirement  we have to create variables inside METHOD,CONSTRUCTOR,BLOCK such type of 
 * variable is called    "LOCAL_VARIABLES"
 */

public class Local_Variables {
	
	
	public static void main(String[] args)
	{
		int i=0;
		for(int j=0;j<=12;j++)
		{
			i=i+j;
		}
		System.out.println(i);
		/*
		 * if i access j here then we will get compile time error saying ==>j cannot be resolved to a variable"
		 */
	}
	

}
