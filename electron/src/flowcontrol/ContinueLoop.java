package flowcontrol;
/*
 * conltinue::: we can use the continue loop to skip  the current execution and  
 */

public class ContinueLoop {
	
	public static void main(String[] args)
	{
		for(int i=2;i<=5;++i)
		{
			//trick goes here continue;
			if(i==4)
				continue;
			System.out.println(i);
		}
	}

}
