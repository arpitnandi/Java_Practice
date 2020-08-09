package programs;

public class Vareable_Declarations 
{
	public static int Static = 0;
	public int NonStatic = 0 ;
	
	public static void main(String[] args) 
	{
		Vareable_Declarations v = new Vareable_Declarations();
		
		int initialising = 300;

		System.out.println( "'Static' global  = " + Static);
		System.out.println( "'NonStatic' global = " + v.NonStatic + "\n" );
		
		v.checkScope( initialising );

		System.out.println( "'Static' global reinitialized = " + Static);
		System.out.println( "'NonStatic' global reinitialized = " + v.NonStatic + "\n" );
	}
	public void checkScope( int value )
	{
		if( value != Static )
		{
			Static = value;
			System.out.println( "'Static' inner local = " + Static );
		}
		System.out.println( "'Static' outer local = " + Static + "\n" );
		
		if( value != NonStatic )
		{
			NonStatic = value;
			System.out.println( "'NonStatic' inner local = " + NonStatic );
		}
		System.out.println( "'NonStatic' outer local = " + NonStatic + "\n" );
	}
}
