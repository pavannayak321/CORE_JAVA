import java.util.*;


class ArrayListMethods{

	public static void main(String[] args)
	{
		List<Integer> list =  new ArrayList<Integer>();
		//checking if there is any empty values
		System.out.println(list.isEmpty());
		
		//find the size of the list
		System.out.println(list.size());
		
		//contains
		System.out.println(list.contains(2));
		
		//add
		for(int i= 0 ;i<12 ;i++){
			list.add(i);
		}
		System.out.println(list);
		
		//clear 
		/*
		list.clear();
		System.out.println(list);
		*/
	
		//remove THE elements
		list.remove(3);
		
		//get the elemens 
		System.out.println(list.get(2));
		
		//set the elements
		list.set(2,234);
		System.out.println(list);
		
		//add at index position
		list.add(0,123);
		System.out.println(list);
	}
	
}