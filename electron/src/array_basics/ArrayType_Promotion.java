package array_basics;
/*
 * promotion:---->child type array can assign to parent type variable 
 */
public class ArrayType_Promotion {
	
	public static void Object_string(Object[] str)
	{
		for(Object x1:str)
		{
			System.out.println(x1);
		}
	}
	
	public static void main(String[] args)
	{
		ArrayType_Promotion.Object_string(new String[] {"hello","pavan","nayak"});
	}

}


		//output:----
//hello
//pavan
//nayak
