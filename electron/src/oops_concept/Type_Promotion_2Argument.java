package oops_concept;

public class Type_Promotion_2Argument {
	/*type promotion with respect to two type of arguments   */
	
	
		public void m1(int x,float y)
		{
			System.out.println("int-float version");
		}
		
		public void m1(float x,int y)
		{
			System.out.println("float-int version");
		}
		
		
		public static void main(String[] args)
		{
			Type_Promotion_2Argument t = new Type_Promotion_2Argument();
									  t.m1(12, 23.4f);   //int-float version will get the chance to execute
									  t.m1(23.4f, 34); 	 //float-int version will get the chance 
						  //t.m1(12, 23);    //-->The method m1(int, float) is ambiguous for the type Type_Promotion_2Argument
									  t.m1(12.f, 's');	//float-int version will get the chance 
		}

}
