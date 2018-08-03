package patternmaching;
import java.util.regex.*;

import java.util.regex.Pattern;

/*
 * we can use quantifiers to specify no of characters to match
 * 		a----.exactly one a 
 * 
 * 		a+----->at lest one a
 * 
 * 		a*---->any no of a
 * 
 * 		a?----->at most one a
 */
public class Quantifiers {

	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("a*");
		Matcher m =p.matcher("abaabaaab");
		while(m.find())
		{
			System.out.println(m.start()+"     "+"  "+m.group()+"    "+m.end());
			//System.out.println(m.find(1)+"iiiiiiiiiiiiiiiiiiiiiiii");
		}

	}

}
