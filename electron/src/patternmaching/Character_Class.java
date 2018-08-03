package patternmaching;
import java.util.regex.*;

public class Character_Class
{

	public static void main(String[] args) 
	{
		Pattern p =Pattern.compile("\\s");//----------------->pre defined character classes 
		Matcher m =p.matcher("absdghvd#@3   4wewe4ddrf");
		while(m.find())
		{
			System.out.println(m.start()+"    "+m.group()+"     "+m.end());
		}

	}

}
