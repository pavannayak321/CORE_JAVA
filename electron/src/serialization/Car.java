package serialization;
import java.io.*;

/*
 * Exception in thread "main" java.io.InvalidClassException:
 */

public class Car implements Externalizable 
{
	String name;
	int year;
	
	/*
	 * mandatory public (no-arg) constructor
	 */
	Car()
	{
		System.out.println("hello");
	}
	
	Car(String name,int year)
	{
		this.name=name;
		this.year=year;
	}
	
	public void writeExternal(ObjectOutput otp) throws IOException
	{
		otp.writeObject(name);
		otp.writeInt(year);
	}
	
	/*
	 * 
	 */
	public void readExternal(ObjectInput oip) throws IOException, ClassNotFoundException
	{
		name=(String)oip.readObject();
		year=oip.readInt();
	}
	public String toString()
	{
		return ("name="+name+"    "+"year="+year);
	}



	public static void main(String[] args)  throws Exception
	{
		Car cr = new  Car("maruthi",2018);
		
		FileOutputStream fos = new FileOutputStream("exteranl.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cr);
			
			
			FileInputStream fis = new FileInputStream("exteranl.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
				String  c=(String)ois.readObject();
				
			

	}

}
