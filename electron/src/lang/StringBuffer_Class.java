package lang;
/*
 * if the content will change the frequently then it is never recommended to go for the String class 
 * 
 * 			because for every change a new object will be created which  may leads to the performance problem of system
 * 			to handle this problem compulsory we should go for "STRINGBUFFER" class 
 * 			where  changes are made to existing object only instead of creating the new Object
 * 
 *  
 */

public class StringBuffer_Class {
	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer("hello-");
		System.out.println(sb.capacity());
		
					sb.append("pavna");
					System.out.println(sb);
					/*
					 * important methods of StringBuffer class 
					 * 
					 * 		(1)length()
					 * 
					 * 		(2)capacity()
					 * 
					 * 		(3)charAt(int index)
					 * 
					 * 		(4)public void setCharAt(int index,char Ch);
					 * 
					 * 		(5)public StringBuffer append(String s);
					 * 
					 * 		(6)public StringBuffer insert(int index,String s)
					 * 
					 * 		(7)delete(int beg,int end)
					 * 
					 * 
					 * 		(8)StringBuffer reverse()
					 */
	}

}
