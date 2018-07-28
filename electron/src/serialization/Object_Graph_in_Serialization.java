package serialization;
import java.io.*;

/*
 * whenever we are trying to serialize an object the set of all objects which are reachable from that 
 * object will be Serializable automatically 
 * this group of objects is called		 "OBJECT GRAPH"
*/
class DogBig implements Serializable
{
	Cat t = new Cat();
	
}
class Cat	implements Serializable
{
	Rat rt = new Rat();
}
class  Rat	implements 	Serializable
{
	int j=123;
}
public class Object_Graph_in_Serialization
{
	
	public static void main(String[] args) throws Exception
	{
		DogBig db = new DogBig();
		FileOutputStream fos = new FileOutputStream("objectGraph.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
							oos.writeObject(db);
							
							FileInputStream fos1 = new FileInputStream("objectGraph.txt");
							ObjectInputStream oos1 = new ObjectInputStream(fos1);
												DogBig o=(DogBig)oos1.readObject();
												System.out.println(db.t.rt.j);
	}

}
