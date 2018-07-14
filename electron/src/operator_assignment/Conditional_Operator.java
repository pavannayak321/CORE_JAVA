package operator_assignment;

public class Conditional_Operator {
	
	public static void main(String[] args)
	{
		int x=(12==12)?12:13;
		System.out.print(x);
		
		
		/*
		 * nesting of conditional  loop is possible
		 */
		int c=12,d=23,r=43;
		int x1=(c==21)?23:((c==43))?23:((c==12))?1234:321;
		System.out.println(x1);
	}
}
//121234
