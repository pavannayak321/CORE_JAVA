package flowcontrol;
/*
 * use case of WHILE loop :::if we don't know the size in advance then better go for the while statement 
 */

public class WhileLoop {
	public void m2()
	{
		{
			System.out.println("hey instance block!!!!!!!!!");
		}
	}
	
	public static void main(String... x) {
		
		
		final int r=12,e=13;
		do
		{
			for(int i=1;i<12;i++)
			{
				System.out.println("hello");
			}
		}while(r==e);
		
		
		System.out.println("hello");
		//System.out.println("hello pra");
		//output ::Unreachable code
		new WhileLoop().m2();
	}
	
	

}
