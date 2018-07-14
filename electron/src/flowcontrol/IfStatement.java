package flowcontrol;



/*
 * the argument to the if statement id boolean type ---if we are providing any other type then we will get compile timeError
 */
public class IfStatement {
	
	public static void main(String[] args)
	{
		int x=12;
		if(x==13) {
			System.out.println("thi code is executed even though the condition failedd");
		}
		   
		{
			System.out.println("hello");
		}
		
		{
			System.out.println("hello123");
		}
	}

}
