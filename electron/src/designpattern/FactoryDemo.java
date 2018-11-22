package designpattern;

/*
 * Factory Method Pattern	::
 * 
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
 *	The Factory Method Pattern is also known as Virtual Constructor.
 */




abstract class  Plan {
	protected double  rate;
	
	abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.println(rate*units);
	}
	
}



class DomesticPlan extends Plan
{

	@Override
	void getRate() {
		rate = 3.50;
		
	}
	
	
}


class CommercialPlan extends Plan
{

	@Override
	void getRate() {
		rate = 	7.50;
		
	}
	
}



class InstitutionPlan extends Plan{

	@Override
	void getRate() {
		rate = 5.50;
		
	}
	
}





/*
 * getting the plan factory of created objects
 */


class PlanFactory{
	public Plan  getPlan(String plantype)
	{
		if(plantype==null)
		{
			return null;
		}
		
		if(plantype.equalsIgnoreCase("DomesticPlan"))
		{
			return new DomesticPlan();
		}
		else if(plantype.equalsIgnoreCase("CommercialPlan"))
		{
			return new CommercialPlan();
		}
		
		else if(plantype.equalsIgnoreCase("InstitutionPlan"))
		{
			return new InstitutionPlan();
		}
		return null;
	}
}


public class FactoryDemo
{
	public static void main(String[] args)
	{
	PlanFactory factory =  new PlanFactory();
	Plan  p	 = factory.getPlan("DomesticPlan");
		p.getRate();
		p.calculateBill(123);
		
	}
}











