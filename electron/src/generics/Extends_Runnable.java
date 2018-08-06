package generics;

public class Extends_Runnable<T extends Runnable>//NA--><Runnable>
{
	public void m1()
	{
		int x=12;
		System.out.println(x);
	}

	public static void main(String[] args)
	{
		Extends_Runnable<Runnable> rnbl = new Extends_Runnable<Runnable>();
	}

}
