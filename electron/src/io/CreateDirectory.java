package io;
import java.io.File;
import java.io.IOException;
/*
 * a java file object can be represented as directory also 
 */

public class CreateDirectory {
	
	public static void main(String[] args) throws IOException
	{
		File f = new File("directorytry.txt");
		f.mkdir();
	}

}
