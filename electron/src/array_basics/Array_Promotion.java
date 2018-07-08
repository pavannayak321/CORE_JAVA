package array_basics;

public class Array_Promotion {
	
	/*
	 * char--->int 
	 */
	public static void int_char(int ch)
	{
		System.out.println(ch);
	}
	
	public static void  call_back(char chs)
	{
	int_char(chs);
	}
	
	public static void main(String[] args)
	{
		//int_char('a');
		Array_Promotion.call_back('a');
	}

}
