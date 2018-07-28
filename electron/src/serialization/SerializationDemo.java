package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable	//if  our class won't implements the Serializable interface 
									//then we won't get any compile time error  we will get runtimeException saying 
{
	public  int x=12;
	int y=123;
}

public class SerializationDemo implements Serializable 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		Dog d1= new Dog();
		FileOutputStream fos = new FileOutputStream("serialization.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
						oos.writeObject(d1);
	}

}
