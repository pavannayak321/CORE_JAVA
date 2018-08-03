package patternmaching;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Match_MobileNumber
{
	public static void main(String...strings) throws IOException
	{
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Mobile Number:");
		Pattern p=Pattern.compile("[0-9]{10}");
		
		
		try
		{
			
			int mobile=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter Valid 10 digit Number");
			 int mobile=sc.nextInt();
		}
		Matcher m =p.matcher("mobile");
		System.out.println("validtion completed:");
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
			PrintWriter  pw =new PrintWriter("thirdfile1.txt");
			BufferedReader br= new BufferedReader(new FileReader("thirdfile.txt"));
			String line=br.readLine();
			
			Pattern ptn= Pattern.compile("[7-9][0-9]{9}");
			
			while(line!=null)
			{
				Matcher mtc=ptn.matcher(line);
				
				while(mtc.find())
				{
					pw.println(mtc.group());
				}
				line=br.readLine();
				
			}
			pw.flush();
	
	}
}
