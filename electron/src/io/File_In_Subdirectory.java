package io;
import java.io.File;
import java.io.IOException;
/*
 * creating the file in specified subdirectory named notes and file name is memories.txt
 */

public class File_In_Subdirectory {

	public static void main(String[] args) throws IOException
	{
	File f = new File("notes");
	f.mkdir();
	
	if(true)
	{
		File f1= new File("D:/jp","date2507.txt");
		f1.createNewFile();
		
	}
		
	}

}
