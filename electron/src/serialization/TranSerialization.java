package serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable	 
{
	  int x=12;
	 int y=123;
}

public class TranSerialization 
{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		Dog d1= new Dog();
		FileOutputStream fos = new FileOutputStream("serialization.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
						oos.writeObject(d1);
						
		FileInputStream fis = new FileInputStream("serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
						Dog d2=(Dog)ois.readObject();
						System.out.println(d2.x);
						
		}
		catch(IOException e)
		{
			
		}
		
		
	}

}
