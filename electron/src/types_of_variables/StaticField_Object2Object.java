package types_of_variables;

public class StaticField_Object2Object {
	int  Branch_id;
	String name;
	static  String college;
	
	public static void main(String[] args)
	{
		StaticField_Object2Object tst1 =  new StaticField_Object2Object();
								  tst1.Branch_id=12;
								  tst1.name="pavan";
								  tst1.college="CVR";
								  
		/*
		 * 	change in value of 2 nd object will reflect on static (or) field variable or class-level variable 				  
		 */
		StaticField_Object2Object  tst2 =  new StaticField_Object2Object();
								   tst2.Branch_id=13;
								   tst2.name="ajay";
								   tst2.college="BMN";
				System.out.println("object 1 value is :"+tst1.Branch_id+"   "+tst1.name+"     "+tst1.college);
				System.out.println("object 2 value is ::"+tst2.Branch_id+"  "+tst2.name+"    "+tst2.college);
	}
	

}
/*
 *output:::----
 * 			object 1 value is :12   pavanBMN
			object 2 value is ::13   ajayBMN
*/
