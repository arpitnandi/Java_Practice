package programs;

public class Eleminate_Spaces 
{
	public static void main(String[] args) 
	{
		String s="Testing Eleminate_Spaced Class.";
		
		System.out.println(s);
		System.out.println(Eleminate_Spaces.getUnderscored(s));
		System.out.println(Eleminate_Spaces.getPlused(s));
		System.out.println(Eleminate_Spaces.getSlashed(s));
		System.out.println(Eleminate_Spaces.getStared(s));
		System.out.println(Eleminate_Spaces.getDotted(s));
	}
	
	public static String getUnderscored(String s)
	{
		String u=s.replaceAll(" ","_");
		return u;
	}
	
	public static String getPlused(String s)
	{
		String p=s.replaceAll(" ","+");
		return p;
	}
	
	public static String getSlashed(String s)
	{
		String sl=s.replaceAll(" ","/");
		return sl;
	}
	
	public static String getStared(String s)
	{
		String st=s.replaceAll(" ","*");
		return st;
	}

	public static String getDotted(String s)
	{
		String dt=s.replaceAll(" ",".");
		return dt;
	}
}