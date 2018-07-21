package oops_concept.polymorphism;

/*
 * 
 * CONSTRUCTOR::--->
 * 
 * 					-->whenever we are creating the object some piece of the code will be executed automatically
 * 					the purpose of the constructor is to perform initialization of the fields that vary from object to object 
 * 
 * 
 * 			IMPORTANT::=to stop inheritance property from the class the we should declare that constructor as private so 
 * 						child class constructor cann't access it by using the [super] keyword 
 */
class Student
{
	int rollno;
	String name;
	
			public Student(int roll,String name)
			{
				this.name=name;
				this.rollno=roll;
				System.out.println("parent-constructor");
			}
}


public class Constructor  extends Student{

	Constructor(int roll, String name) {
		super(roll, name);
		System.out.println(name+""+rollno);
	
	}

	public static void main(String[] args) {
		Constructor p= new Constructor(12,"pavaan");
		

	}

}
