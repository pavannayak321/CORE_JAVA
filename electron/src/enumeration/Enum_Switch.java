package enumeration;
/*
 * from 1.5
 */
enum Month1
{
	JAN,FEB,MAR;
}
public class Enum_Switch
{

	public static void main(String[] args)
	{
		Month1 m=Month1.JAN;
		
		
		switch(m)
		{
		case JAN:
		{
			System.out.println(m+"jan");
			break;
		}
		case FEB:
		{
			System.out.println(m+"feb");
			break;
		}
		case MAR:
		{
			System.out.println(m+"mar");
			break;
		}
		}
		Month1[] m2=Month1.values();
		//System.out.println(m2);
		for(Month1 String1:m2)//-------------------------->
		{
			System.out.println(String1);
		}

	}

}
