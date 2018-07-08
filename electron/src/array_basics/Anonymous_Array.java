package array_basics;

public class Anonymous_Array {
	public static  void sum(int[] k)
	{
		int len=k.length;
		
	for(int i=0;i<len;i++)
	{
		System.out.println(k[i]);
	}
	
	}

	public static void main(String[] args) {
		/*
		 * calling sum() by creating and passing  anonymous array  
		 */
		
		sum(new int[] {12,13,14,15,16});

	}

}
