package lang;
/*
 * PROPER HASH_CODE:::=
 * 
 * 					class Student
 * 					{
 * 						---------
 * 						---------
 * 						---------
 * 					public int hashCode()
 * 					{
 * 						return rollnumber;
 * 					}
 * 					}
 */

public class Proper_hashCode_Function {
	int roll_number;
	
	Proper_hashCode_Function(int roll_number)
	{
		this.roll_number=roll_number;
	}
	
	public int hashCode()			//-->overriding the hashCode() method.........
	{
		return roll_number;
	}
	
	public static void main(String[] agrgs)
	{
		Proper_hashCode_Function p1 = new Proper_hashCode_Function(1249);
		Proper_hashCode_Function p2 = new Proper_hashCode_Function(1248);
								int hcode=p1.hashCode();
								int h1code=p2.hashCode();
								System.out.println("hashCode"+p1.hashCode());
								System.out.println("tostring)"+p1.toString());
								System.out.println("hashCode"+p2.hashCode());
								System.out.println("tostring)"+p2.toString());

	}

}
