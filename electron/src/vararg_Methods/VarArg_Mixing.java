package vararg_Methods;

public class VarArg_Mixing {
	
	
	public void m2(String name,int... is)
	{
		System.out.println(name+"      "+is);
	}
	public static void main(String[] args)
	{
		VarArg_Mixing vargs = new VarArg_Mixing();
						vargs.m2("pavan", new int[] {12,13,34,56});
	}

}

/*
 * OUTPUT:----:------:-----:>>  pavan     [I@7852e922(reason)




*/