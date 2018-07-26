package io;

import java.io.File;
import java.io.IOException;

/*
			 * File f = new File("abc.txt");
			 * this line won't create any physical file it is just java  logical file 
			 * if abc.txt is available then simply it is pointing to the that file 
			 * if it is not available the f represents just name of the file without creating any physical file 
			 */

public class Create_File {

	public static void main(String[] args) throws IOException
	{
	
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
