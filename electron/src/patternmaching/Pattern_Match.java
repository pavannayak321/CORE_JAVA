package patternmaching;
import  java.util.regex.*;

public class Pattern_Match {

	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("a{1,}");
		Matcher m=p.matcher("abbbbaabbcbdab");
			while(m.find())
			{
				System.out.println(m.start()+"     "+m.end()+"    "+m.group());
			}

	}

}
