package array_basics;

public class Array_Length {

	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=377;
		a[1]=1;
		a[2]=2;
		a[3]='@';
		System.out.println(a[3]);
		/*
		 * final length ---->for returning the length of the array  
		 */
	int len=a.length;
	System.out.println(len);
	/*
	 * length()--------->for returning the length of the string 
	 */
	String name  = "pavan";
	int length=name.length();
	System.out.println(length);

	}

}
