package generics;

/*
 * 	       TWO TYPE PARAMETER IN GENERICS 
 */
class TwoGen<T,V> //< T a,V v> -----Syntax error on token "a", delete this token
{
	T obj1;
	V obj2;
	
		TwoGen(T obj1,V obj2)
		{
			this.obj1=obj1;
			this.obj2=obj2;
			
		}
		public void showtype()
		{
			System.out.println(obj1.getClass().getName());
			System.out.println(obj2.getClass().getName());
		}
}
public class Two_Type_Parameter {

	public static void main(String[] args)
	{
		TwoGen<String,Integer> genobj = new TwoGen<String,Integer>(new String("pavan"),new Integer(12));
								genobj.showtype();
	}

}
