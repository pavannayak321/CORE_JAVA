package generics;

public class Bounded_Type_Parameter<T extends Number> 
{
	T ob;
	T ob2;
	Bounded_Type_Parameter(T ob)
	{
		this.ob=ob;
		Thread t = new Thread();
		
	}
	
	public T get()
	{
		return ob;
	}

	public static void main(String[] args)
	{
		Bounded_Type_Parameter<Double> str = new Bounded_Type_Parameter<Double>(23.5);
										System.out.println(str.get());

	}

}
