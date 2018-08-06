package generics;
import java.util.*;
/*
 * ACCEPTED SYNTAX for wild card-character
 * 
 * 
 * 	public void m1(ArrayList<? extends Number> numb)
 * 		{
 * 			--------------------------
 * 			--------------------------
 * 			--------------------------
 * 			--------------------------
 * 		}
 * 
 * 	public void m1(ArrayList<? extends Runnable> ladd)
 * 		{
 * 			--------------------------
 * 			------------?==>can be class or interface --------------
 * 			--------------------------
 * 			--------------------------
 * 		}
 * 
 * public void m1(ArrayList<? super X> ladd)
 * 		{
 * 			--------------------------
 * if x is class then we can call this method by passing x class object reference as argument or it's parent reference 
 * 			--------------------------
 * 			--------------------------
 * 			--------------------------
 * 		}
 */
public class Wild_Card_Methods
{
	public void method_N_call(ArrayList ladd)
	{
		ladd.add("edef");
		method_N_cal(ladd);
		
	}
	
	public void method_N_cal(ArrayList<?> lad)
	{
		System.out.println("-----------");
	}

	public static void main(String[] args)
	{
		Wild_Card_Methods obj= new Wild_Card_Methods();
		ArrayList l = new ArrayList();
					l.add("123");
					l.add("Ed sharan");
					System.out.println(l);
					obj.method_N_call(l);
					System.out.println("after entering into method call:"+l);
				
					//System.out.println(ladd.equals(l));---------------------------->?????? 
					//HOW TO COMPARE TWO OBJECTS ARE SAME ARE NOT 
	}

}
