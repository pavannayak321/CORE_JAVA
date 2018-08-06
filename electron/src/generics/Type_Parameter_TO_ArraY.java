package generics;

/*
 * 
 */

class NameDisplay<T>
{
	T obj1;
	T[] obj;
	NameDisplay()
	{
		
	}
	NameDisplay(T[] names)
	{
		this.obj=names;
	}
	
	public void show()
	{
		for(T x2:obj)
		{
			System.out.println(x2);
		}
	}
}
public class Type_Parameter_TO_ArraY {

	public static void main(String[] args) 
	{
		NameDisplay<String> strng = new NameDisplay<>(new String[] {"pavan","kumar","nayaks"}) ;
		//NameDisplay nms = new NameDisplay<Integer>();---->after compilation of classes generic effects will be removed 
		strng.show();
	}

}
