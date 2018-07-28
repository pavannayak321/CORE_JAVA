package serialization;
import java.io.*;


/*
 * the purpose of the customized serialization is to  encrypt the data instead of overriding the concept of the 
 * assigning the default value as null to the transient variable 
 */
class Serial	implements Serializable
{
	String user_name="durga";
	transient String password="durga123";
	/*
	 * 
	 */
	private void writeObject(ObjectOutputStream o) throws IOException
	{
		o.defaultWriteObject();
		String epassword="123"+password;
		o.writeObject(epassword);
	}
	/*
	 * 
	 */
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String epassword=(String)ois.readObject();
		password=epassword.substring(3);
		
	}
	
}
public class CustommizedException
{
	public static void main(String[] args)  throws Exception
	{
		Serial ser = new Serial();
		System.out.println("name"+ser.user_name+"    "+"password="+ser.password);
		
		FileOutputStream fos = new FileOutputStream("epassrd.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
							oos.writeObject(ser);
							
							FileInputStream fis = new FileInputStream("epassrd.txt");
							ObjectInputStream ois = new ObjectInputStream(fis);
										Serial sr=(Serial)ois.readObject();
										System.out.println(sr.password);
							
		
		

	}

}
