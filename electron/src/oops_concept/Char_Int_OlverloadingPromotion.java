package oops_concept;
/*
 * 
 */

public class Char_Int_OlverloadingPromotion {
	/*promoting w.r.t the primitive variables */
	
	public void ma(int x)
	{
		System.out.println("int-version");
	}
	
	public void ma(float x) {
		System.out.println("float-version");
	}
	
/*============================promoting  the reference data types=========================================================== */
	
	public void m1(String x)
	{
		System.out.println("string-version");
	}
	
	public void m1(Object x)
	{
		System.out.println("object-version");
	}
	
/*===================================AMBIGUITY PROBLEM IN Overloading ================================================================*/
			
	
	
						public void m2(String s)
						{
							System.out.println("string-versiopn");
						}
						
						public void m2(StringBuffer sb)
						{
							System.out.println("stringbuffer-version");
						}
/*==============================================================================================================================*/						
	
	
	
	public static void main(String[] args)
	{
		Char_Int_OlverloadingPromotion  t =   new Char_Int_OlverloadingPromotion();
										t.ma('a');/*----->actually char but promoted to int  */
										t.ma(12);/*------>int version  */
										t.ma(12l);/*------>float version  */
										
										
		/*==============================================================================================================*/
										t.m1(new Object());  /*------->object version    */
										t.m1("hello");		/*-------->String-version    */
										t.m1(null);/*------------>child class will get the first choice =[String] */
										
		/*==============================================================================================================*/
										t.m2("hello");  /*--------string-version---------*/
										t.m2(new StringBuffer());/*-----StringBuffer------*/
										//t.m2(null);    /* due to same level class ambiguity problem  */
	}

}
