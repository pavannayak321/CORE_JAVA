package innerclasses;


public class Anonymous_As_Argument {

	public static void main(String[] args)
	{
		
		Thread t = new Thread(new Runnable()
							{
								public void run()
								{
									for(int i=1;i<12;i++)
									System.out.println("123");
								}
			
							});
		t.start();
		for(int i=1;i<12;i++)
		{
			System.out.println("hello");
		}
	}

}
