package programs;

public class Vareable_Scope 
{
	public static void main(String[] args)
	{
		Vareable_Declarations v = new Vareable_Declarations();
		
		System.out.println( Vareable_Declarations.Static );
		System.out.println( v.NonStatic );
	}
}
