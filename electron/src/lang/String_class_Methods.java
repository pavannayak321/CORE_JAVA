package lang;
/*
 * important methods of string class 
 * 			
 * 			(1)	charAt(int index)
 * 
 * 			(2)	concat(String con)
 * 
 * 			(3) the overloaded +,+= also meant for concatenation only 
 * 
 * 			(4) boolean equals()  		 overridden version of the Object class for content comparison
 * 
 * 			(5)equalIgnoreCase()    	it is meant for content comparison except the case sensitivity 
 * 
 * 			(6)substring(int index)
 * 
 * 			(7)substring(int beg,int end)   returns returns the string from [beg index,end-1] index
 * 
 *   		(8)toLowerCase()
 *   
 *   		(9)toUpperCase()
 *   
 *   		(10)String replace(char old,char new)
 *   
 *   		(11)String strim()    -->to remove the blank space present at the begning  and end of the string but not blank spaces 
 *   								 present at the middle of the string
 *   
 *   		(12)int indexOf()	-->returns the first occurrence of the specified character 
 */

public class String_class_Methods {

	public static void main(String[] args)
	{
		String name="pavan";
		System.out.println(name.charAt(2));
		
		/*
		 * 
		 */
		String name1="Pavan";
		System.out.println(name.equals(name1));
		/*
		 * 
		 */
		System.out.println(name.equalsIgnoreCase(name1));
		/*
		 * 
		 */
		System.out.println(name.toUpperCase());

	}

}
