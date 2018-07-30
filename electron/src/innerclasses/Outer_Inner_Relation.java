package innerclasses;
/*
 * if a class extends the other class then it should satisfy the condition of [super].call() to the parent class 
 * 
 * but in case of the inner-class it is failed to satisfy it shows that the relationship between the 
 * outer class and inner class is HAS-A    NOT    [IS-A] relationship
 */

class OuterM
{
	int x=12;
	class InnerM
	{
		int x=123;
		
		private  void m1()
		{
			System.out.println("accesing the inner class private methods");
			//System.out.println(super.x);	//x cannot be resolved or is not a field
		}
	}
	public void inneraccess()
	{
		InnerM m = new InnerM();
			m.m1();
	}
}
public class Outer_Inner_Relation {

	public static void main(String[] args) {
		
		OuterM om = new OuterM();
				om.inneraccess();
		

	}

}
