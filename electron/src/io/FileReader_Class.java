package io;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import io.Create_File;
import io.FileWriter_Class;
/*
 * methods of fileReader::--
 * 
 *  						int read()-->attempts to read the next character from the file and returns it's uniCode 
 *  
 *  										if next character is not available then this method returns -1
 */

public class FileReader_Class {
	public static void main(String[] args) throws IOException
	{
		File f = new File("write.txt");
		FileReader fr = new FileReader("write.txt");
					System.out.println(fr.read());
					char[] ch2= new char[(int)f.length()];
					fr.read(ch2);
					for(char ch:ch2)
					{
						System.out.println(ch);
					}
					fr.close();
					
	}

}
