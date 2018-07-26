package io;
import java.io.*;

/*
 * the method for the BuoffredReader is common as FileReader ,  except update of 
 * 						String readLine();----> 
 * 										which reads the data line by line
 * 			
 * 										if next line is available then it returns simply otherwise it returns it 
 * 										otherwise it returns "null"
 */

public class BufferedReader_Class {

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("write.txt");
		BufferedReader b= new BufferedReader(fr);
					String line=b.readLine();
					
					while(line!=null)
					{
						System.out.println(line);
						line=b.readLine();
					}
					b.close();
		
		

	}

}
