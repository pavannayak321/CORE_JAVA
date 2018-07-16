package oops_concept.overriding;
/*
 * in case of overloading the return type is not required to check
 * but in case of the overriding the return type we have to cross check but this condition is applicable until [1.4]
 * from [1.4]  [--CO-VARIENT--] return type is allowed 
 */
class ParentCovarient
{
	public Object m1()
	{
		return null;
	}
}

class ChildCovarient extends  ParentCovarient
{
	/*
	 * CO-VARIENT::--- according  to this 
	 * 				child method return type need not be the same as the parent class return type its child class also allowed 
	 */
	public  String m1()
	{
		System.out.println("method called  ");
		return "pavan";
		/*
		 * CO-VARIENT RETURN TYPE IS APPLICABLE ONLY FOR [OBJECT TYPE BUT NOT FOR PRIMITIVE TYPES]
		 */
	}
}

public class OverridingReturnType {

	public static void main(String[] args) {
		
		ParentCovarient p= new ChildCovarient();
						p.m1();
	}

}
