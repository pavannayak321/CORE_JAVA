package oops_concept.polymorphism;
/*
 * Factory_Mehtod::-->   by using the class name if we call any method and & that return's the same class object 
 * then that method is considered as factory method 
 * 
 * EG:=
 * 				Runtime r = Runtime.getRuntime();
 * 				DateFormat df = DateFormat.getInstance();
 */
class Factory_Method1 {
	
	private	 static  Factory_Method1 t=null ;
	
	
	private Factory_Method1()
	{
		System.out.println("hello");
	}
	
	public static Factory_Method1  getInstance()
	{
		if(t==null)
		{
			t= new Factory_Method1();
		}
		return t;
	}
	
	
}		

public class Factory_Method{
	private Factory_Method()
	{
		
	}
			public static void main(String[] args)
			{
				//Factory_Method1 t =new Factory_Method1();---->The constructor Factory_Method1() is not visible
			}
}


