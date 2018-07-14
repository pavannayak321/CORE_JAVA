package flowcontrol;
/*
 * we use break statement in following cases
 * 1>WITHIN THE SWITCH TO STOP FALL_THROUGH
 * 2>INSIDE LOOP TO STOP LTHE EXECUTION OF THE REMAINING CONDITIONS
 * 3>INSIDE LABEL BLOCK TO BREAK THE LABEL BLOCK EXECIUTION
 * 
 *
 */

public class BreakStatement {
	
	
	
	public static void main(String[] args)
	{
		for(int i=1;i<3;i++)
		{
			System.out.println("hello");
			if(i==2)
			{
				break;
			}
		}
	}

}
