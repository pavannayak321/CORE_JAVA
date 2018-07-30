package innerclasses;
/*
 * sometime we can declare a class without name such type of classes are called anonymous inner classes
 * 		
 * 			there are 3 types of the anonymous inner classes 
 * 
 * 			1>a class that extends a class 
 * 
 * 			2> a class that implements an interface 
 * 
 * 			3>class that is defined inside arguments 
 * 
 */
class Normal
{
	

	public void m1()
	{
		System.out.println("method in normal");
	}
}

public class Anonymous_Inner_Classes {
	
	public static void main(String[] args)
	{
		Normal  p = new Normal();
		Normal  as = new Normal()
				{
					public  void m2()	
					{
					System.out.println("tryinng to create the method in anonymous class");
					}
				};
				p.m1();
				//as.m2(); //trying to access but C.E=[The method m2() is undefined for the type Normal]
				
				Thread t = new Thread()
						{

					public void run()
					{
						
						for(int i=1;i<12;i++)
						{
							System.out.println("hello");
						}
					}
						};
						t.start();//-------------------------------------------------------->>>>>
						for(int i=1;i<12;i++)
						{
							System.out.println("hello123");
						}
						
						/*
						 * anonymous inner class that implements Runnable Interface
						 * 
						 */
						Runnable r = new Runnable()
								{
							public void run()
							{
								for(int i=2;i<12;i++)
								{
									System.out.println("123");
								}
							}
								};
								Thread t2 = new Thread(r);
										t2.start();//----------------------------------->>>>>>>
	}

}
