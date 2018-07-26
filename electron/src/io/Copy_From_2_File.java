package io;
import java.io.*;

public class Copy_From_2_File {
	
	public static void main(String...strings ) throws IOException
	{
		File f1 = new File("write1.txt");
		File f2= new File("write2.txt");
		BufferedReader br1 = new BufferedReader(new FileReader(f1));
		BufferedReader br2 = new BufferedReader(new FileReader(f2));
		PrintWriter pw = new PrintWriter("thirdfile.txt");
						String s1 =br1.readLine();
						String s2= br2.readLine();
						
						System.out.println(s1+s2);
						while(s1!=null||s2!=null)
						{
							
										pw.println(s1);
										pw.println(s2);
										
										s1=br1.readLine();
										s2=br2.readLine();
										
						}
						br1.close();
						br2.close();
						pw.close();
						
						
						
	}
	

}
