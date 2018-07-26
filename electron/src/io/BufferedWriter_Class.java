package io;
import java.io.*;
/*
 * 							problem with usage of FileWriter&FileReader
 * 
 * 		(1)	while writing the data to the file we have to insert the line separator which is biggest headache  to programmer 
 * 
 * 		(2)	by using the fileWriter we can read the data char to char 
 * 
 * 	    to solve this problem sun people introduced     --> BufferedWriter&BufferedReader <---
 */

public class BufferedWriter_Class {

	public static void main(String[] args) throws IOException
	{
		FileWriter f = new FileWriter("write.txt",true);
		
		BufferedWriter b = new BufferedWriter(f);
					b.newLine();
					b.write("--hello");
					b.close();

	}

}
