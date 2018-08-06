package collections;
import java.util.*;
/*
 * how to get the synchronized version of the ArrayList
 */
public class Synchroonized_ArrayList {

	public static void main(String[] args)
	{
	ArrayList<?> list = new ArrayList<Object>();
				/*
				 * by using the collections class
				 * ||public static List synchronizedList(List l);||
				 */
	@SuppressWarnings("unchecked")
	List<?> synchr=Collections.synchronizedList(list);
	
	}

}
