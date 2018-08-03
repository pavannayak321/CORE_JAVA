package control_loops;
import java.io.*;
/*
 * when a series of decision involved we have to make more than if-else statement 
 */
public class Nesting_If {

	public static void main(String[] args) throws IOException
	{
		int x=12,y=34;
		
		if(x==12)
		{
			System.out.println(x);
			if(y==34)
			{
				System.out.println(y);
			}
		}

	}

}
