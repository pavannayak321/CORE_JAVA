package generics;

public class Constructr_Generic_Class_NonGeneric
{
	<E extends Number>Constructr_Generic_Class_NonGeneric(E e)//applicable
	{
		System.out.println(e);
	}
	public static void main(String[] args)
	{
		Constructr_Generic_Class_NonGeneric v = new Constructr_Generic_Class_NonGeneric(new Integer(123));
	}

}
