package operator_assignment;



/*
 * instanceOf operator is used to check weather the reference type belonging to Class/Interface 
 */
class Student
{
	String name;
	int id;
	
}

public class InstanceOf_Operator {
	public static void main(String[] args)
	{
		Student  st= new Student();
		System.out.println(st instanceof Student);
	
	}

}
