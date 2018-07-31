package exceptionhandling.customexception;
import exceptionhandling.customexception.ResultValidation;
public class CheckResult {

	public static void main(String[] args) {
		
		ResultValidation v = new ResultValidation();
		try
		{
		v.checkReaction();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
