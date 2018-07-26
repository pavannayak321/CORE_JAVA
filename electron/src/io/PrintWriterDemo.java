package io;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


class Test
{
	
}

public class PrintWriterDemo
{
	/*
	 * by using FileWriter and  BufferedWriter we can only write char data to the file 
	 * in bufferedWriter we  have only 2 methods in additional 
	 * (1)newLine();
	 * (2)readLine();
	 * 
	 * by using the printWriter we can   write ant type of data to the file 
	 */
	public static void main(String[] args)	throws IOException
	{
		//Test t = new Test();
		//FileWriter f = new FileWriter("write.txt");
		PrintWriter pw = new PrintWriter("write");
					pw.write(122);
					//pw.print(t);
					System.out.println(12.4);
					System.out.print(12.4);
					pw.close();
					
	}

}
