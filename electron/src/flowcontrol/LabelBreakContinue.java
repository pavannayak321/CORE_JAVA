package flowcontrol;
/*
 * label break and continue 
 */

public class LabelBreakContinue {
	public static void main(String[] args)
	{
		 l1:
		for(int i=1;i<=5;i++)
		{
			l2:
			for(int j=1;j<=5;j++)
			{
				System.out.println("i"+i+"    "+j);
				if(j<=2)
				{
					break l2;
				}
				System.out.println("i"+i+"    "+j);
				
			}
		}
	}

}
