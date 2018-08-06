/**
 * 
 */
/**
 * @author SAKKU JADAV
 *
 */
package internationalization;
import java.util.Locale;

class Package
{
	public static void main(String[] args)
	{
		Locale l =Locale.getDefault();
	/*
	 * 	
	 */
		System.out.println("Country Name::"+"\t"+l.getCountry());
		System.out.println("Country Language::"+"\t"+l.getLanguage());
		/*
		 * 
		 */
		String[] l2=Locale.getISOCountries();
		for(String s2:l2)
		{
			System.out.println(s2);
		}
	}
}