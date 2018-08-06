package generics;

public class Notes {
	/*
	 * public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() { return data; }
    // ...
}
becomes this after type erasure:

public class Node {

    private Comparable data;
    private Node next;

    public Node(Comparable data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Comparable getData() { return data; }
    // ...
}
///////////////////////////////////////////////////////////////////////////////////////
 */////////////////////////////////////////////////////////////////////////////////////
	/*public class Test<T>
	{
		private T t;
		public void set(T t)
		{
		System.out.println("ewew");
		}
	public static void main(String... args)
	{
		Test<String> t = new Test();
			t.set("hello");
		}
		}
		////////////////////////////////////////////////////////////////////////////////
		 ////////////////////////////////////////////////////////////////////////////////
	public class Test<X extends Number>
	{
		
		private int x;;
		public void set()
		{
		System.out.println("ewew");
		}
	public static void main(String... args)
	{
		Test<String> t = new Test();
			t.set();
			---------------------------------------------------------------------------
			-----------------------------------
			D:\jp>javac Test.java
Test.java:11: error: type argument String is not within bounds of type-variable X
        Test<String> t = new Test();
             ^
  where X is a type-variable:
    X extends Number declared in class Test
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
----------------------------------------
			
		public class Test
{
Number n;
	
	private int x;
	public void set(Number n)
	{
	this.n= n;
	System.out.println(n);
	}
public static void main(String... args)
{
	Test t = new Test();
		t.set(new Integer(12));
	}
	}
	------------------------------------------
	-----------------------------------------
	------------------------------------------
	class Student1
{


}

class Student12 extends Student1
{

	
}

public class Test
{
	public void execute(Student1 l)
	{
		System.out.println(l.getClass().getName());//-------->Student12[{[{due to type promotion in the class }]}]
	}
	
	public  static void main(String[] args)
		{
		Test t = new Test();
			t.execute(new Student12());
		}
}

-------------------------------------------------------------------
-------------------------------------------------------------------
-------------------------------------------------------------------
		
	*/
	 

}
