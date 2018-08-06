package generics;


class NonGen
{
	int num;
	NonGen(int i)
	{
		num=i;
	}
}

class Gen<T> extends NonGen
{
	T a;
	int num;
	Gen(T a,int x)
	{
		super(x);
		this.a=a;
		this.num=x;
		System.out.println("name is "+a+"    "+"marks is "+x);
	}
	
	
}
public class Generic_Super_Sub
{

	public static void main(String[] args)
	{
		
		Gen<String> t = new Gen<String>("Pavan",345);
	}

}
