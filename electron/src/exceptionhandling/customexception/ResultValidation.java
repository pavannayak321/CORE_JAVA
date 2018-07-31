package exceptionhandling.customexception;
import java.util.Scanner; 
import exceptionhandling.customexception.ResultReactionException;

public class ResultValidation 
{
	int marks;
	public void checkReaction() throws ResultReactionException
	{
		System.out.println("please enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks=sc.nextInt();
		this.marks=marks;
		if(marks<35)
		{
			throw new ResultReactionException("come to home we are waiting for you!!!!!!!");
		}
		else
		{
			System.out.println("keep hardWork!!");
		}
	}

}
