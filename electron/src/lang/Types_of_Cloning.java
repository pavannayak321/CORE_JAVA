package lang;
/*
 * THERE ARE TWO TYPES OF CLONING THE OBJECT 
 * 			
 * 			SHALLOW CLONING::-->
 * 
 * 								THE PROCESS OF CREATING THE JUST DUPLICATE REFERENCE VARIABLE BUT NOT DUPLICATE OBJECT IS CALLED 
 * 								"SHALLOW CLONING"
 * 
 * 			DEEP  CLONING::-->
 * 
 * 								THE PROCESS OF CREATING THE EXACT DUPLICATE INDEPENDENT OBJECT IS CALLED "DEEP CLONING"
 */
class Shallow_Cloning implements Cloneable
{
	
}

class Deep_Cloning 	implements Cloneable
{
	
	/*
	 * 
	 */
	
	
}

public class Types_of_Cloning extends Deep_Cloning implements Cloneable {
	String name;
	int roll;

	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		Shallow_Cloning ob1= new Shallow_Cloning();
		Shallow_Cloning obj2=ob1;     //----->shallow cloning 
		
		Deep_Cloning cln=new Deep_Cloning();
					//cln.clone();----->The method clone() from the type Object is not visible
	}

}
