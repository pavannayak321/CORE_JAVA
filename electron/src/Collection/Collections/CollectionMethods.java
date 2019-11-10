import java.util.*;



class Test{
	public static void main(String[] args)
	{
	 List<Integer> list = new ArrayList<Integer>();
	 for(int i=0 ;i<12 ;i++)
	 {
		 list.add(i);
	 }
	 
	 //reverse the collections elements
	 Collections.reverse(list);
	 System.out.println("reversing the lst"+list);
	 
	 //finding the max element in Collections
	 System.out.println("finding the max element"+Collections.max(list));
	 
	 
	 //Collections.shuffle(list);
	 Collections.shuffle(list);
	 System.out.println("shuffling the elements in Collections"+list);
	 
	 //rotate element's by digits
	 Collections.rotate(list,2);
	 System.out.println("rotate elements in Collections"+list);
	 
	 //sort the collections elements
	 Collections.sort(list);
	 System.out.println("Sort the Elements of List"+list);
	 
	 //frequency in collection 
	 int n  = Collections.frequency(list,1);
	 System.out.println("Frequency of occurance of list"+n);
	 
	 
	 System.out.println(Collections.contain(1));
	}
}