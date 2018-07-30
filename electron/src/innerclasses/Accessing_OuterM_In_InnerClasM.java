package innerclasses;
/*
 * from the inner class  we can directly access the outer class members of static and non-static  directly 
 */
class OuterMember
{
	private int x=12;
	public class InnerMember
	{
		public void m1()
		{
			System.out.println(x);
		}
	}
	public void accesInner()
	{
		InnerMember m = new InnerMember();
					m.m1();
	}
	public static void main(String[] args)
	{
		OuterMember otm = new OuterMember();
					otm.accesInner();
	}
}

public class Accessing_OuterM_In_InnerClasM {

	public static void main(String[] args) {
		

	}

}
