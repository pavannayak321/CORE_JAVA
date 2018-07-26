package io;
import java.io.FileWriter;
import java.io.IOException;
/*
 * 	we use FileWriter object to write character data to the File
 */

public class FileWriter_Class {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("write.txt");
					fw.write("hello pavan");
					fw.close();
				FileWriter fw1 = new FileWriter("write.txt");
						fw1.write('c');
						fw1.close();
						
						/*
						 * appending the FileWriter class Object
						 */
						FileWriter fw3 = new FileWriter("write.txt",true);
									fw3.write(108);
									fw3.write('\n');
									fw3.write("hello");
									fw3.write('\n');
									fw3.write("new line");
									fw3.close();
									
									/*
									 * methods of the FileWriter::
									 * 
									 * 		(1) write(int ch)
									 * 
									 * 		(2)	write(char ch)  -->to write array of characters to the file 
									 * 
									 * 		(3)	write(String s)
									 */
	}

}
