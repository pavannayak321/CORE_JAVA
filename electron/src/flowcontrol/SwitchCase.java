package flowcontrol;
/*
 * [ Switch(argument)--->
 * | ALLOWED ARRGUMENTS=>BYTE,SHORT,INT,CHAR[1.4]
 * |				 =>CHAR,INT,SHORT,BYTE,SHORT,ENUM,INTEGER,[1.5]
 * |				 =>CHAR,INT,SHORT,BYTE,SHORT,ENUM,INTEGER,sTRING[1.7]
 */

public class SwitchCase {

	public static void main(String[] args) {
		String[] name = new String[]{"pavan","kishan","rana","subhash","swraj"};
		for(String x1:name)
		{
			switch(x1)
			{
			case "kishan":
				System.out.println("hello kishan");
				break;
				
			case "pavan":
			{
				System.out.println("hello"+x1);
			}
			
			}
			/*
			 * invalid case ::::
			 * case y:
			 * {
			 *------code--------
			 * }
			 */
		}

	}

}
