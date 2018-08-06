package generics;
/*
 * we can create the object  for the parameterized class i.e  generic class without passing the type also 
 * this type is called raw type 
 */
public class RawType_Generics<T>
{
	T ob;
	
	public void set(T t)
	{
		System.out.println("hello method");
		//----------------
		//----------------
	}

	public static void main(String[] args)
	{
		RawType_Generics type = new RawType_Generics();
							type.set(new String());
		RawType_Generics<Integer> type1 = new RawType_Generics<Integer>();
		//type1.set(new String());
	}

}
