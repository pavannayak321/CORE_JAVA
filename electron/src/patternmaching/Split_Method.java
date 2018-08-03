package patternmaching;
import java.util.regex.*;
/*
 * pattern class contains the split method to split  the given string to as regular expression
 */

public class Split_Method {

	public static void main(String[] args)
	{
		Pattern p =Pattern.compile(" ");
		String[]  m =p.split("hellopavan  kumar");
		for(String s1:m)
		{
			System.out.println(s1);
		}

	}

}
