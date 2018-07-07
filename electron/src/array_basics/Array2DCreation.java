package array_basics;

public class Array2DCreation {
	public static void main(String[] args)
	{
		int[][] a = new int[5][];
		/*
		 * a[0]=object creation
		 */
		a[0]=new int[1];
		System.out.println(a[0]);
		
		a[0][1]=2;
		System.out.println(a[0][0]);
		
		
		/*
		 * creating  and copying the  array values of char  type 
		 */
		char[] a2= { '2','s','s','f'};
		char[] a3= new char[4];
		
		System.arraycopy(a2,0,a3,0,4);
		System.out.println(new String(a3));
		
	
	}

}
