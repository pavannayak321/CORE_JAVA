package lang;
/*
 * 
 */
public class Equals_MEthod {
	
	String name;
	int roll_number;
	static String clg_name="CVR COLLEGE";
	
	
	Equals_MEthod(String name,int roll_number)
	{
		this.name=name;
		this.roll_number=roll_number;
	}
	
	public boolean equals(Object o)
	{
		Equals_MEthod m =(Equals_MEthod)o;
		String name1=this.name;
		int roll1=this.roll_number;
		
		String name2 = m.name;
		int roll2 = m.roll_number;
		
		if(name1.equals(name2)&&(roll1==roll2))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		
		Equals_MEthod m1= new Equals_MEthod("paan",123);	
		Equals_MEthod m2= new Equals_MEthod("pavan",123);
		Equals_MEthod m3= new Equals_MEthod("pavan",123);
		m3=m1;
		System.out.println(m1.hashCode());
		System.out.println(m3.hashCode());
		
					Boolean f=m1.equals(m2);
					System.out.println(f+""+(m1==m2));
		

	}

}
