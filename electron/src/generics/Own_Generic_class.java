package generics;
/*
 * any type of class
 *			|||||				*/
class Pavan<Pavan>
{
	public void name()
	{
		System.out.println("pavan printed");
	}
}


public class Own_Generic_class<T>
{
	T ob;
	Own_Generic_class(T ob)
	{
		this.ob=ob;
	}
	/*
	 * 
	 */
		public void show()
		{
			System.out.println("the type of object is "+ob.getClass().getName());
			
		}
	public static void main(String[] args)
	{
		Own_Generic_class<String> obj =new Own_Generic_class<String>("hello pavan");
		obj.show();
		System.out.println(obj.ob);
		Pavan<Pavan> p = new Pavan<Pavan>();
					p.name();

	}

}
