package Method_Overriding;


public class GrandParent2 extends Ancestor
{
	static String Class="GrandParent2";
	
	public static void main(String[] args)
	{
		GrandParent1.test1();
		GrandParent1.test2();
		GrandParent1.test3();
		GrandParent1.test4();
		
		test1();
		test2();
		test3();
		test4();
	}
	
	public static void test1()
	{
		String Test="test1";
		
		Ancestor GP1 = new GrandParent1();						//Creating the child class object as the Ancestor interface type
		Ancestor GP2 = new GrandParent2();
		
		System.out.println(GP1.method11(Test+" of "+Class));	//Running methods as object of same class
		GP1.method12(Test+" of "+Class);
		
		System.out.println(GP2.method21(Test+" of "+Class));
		GP2.method22(Test+" of "+Class);
		
		System.out.println();
	}
	
	public static void test2()
	{
		String Test="test2";
		
		Ancestor GP1 = new GrandParent1();						//Creating the child class object as the Ancestor interface type
		Ancestor GP2 = new GrandParent2();
		
		System.out.println(GP1.method11(Test+" of "+Class));	//Running methods as object of another class
		GP1.method12(Test+" of "+Class);
		
		System.out.println(GP2.method21(Test+" of "+Class));
		GP2.method22(Test+" of "+Class);
		
		System.out.println();
	}
	
	public static void test3()
	{
		String Test="test3";
		
		GrandParent1 GP1 = new GrandParent1();					//Creating the child class object as same class type
		GrandParent2 GP2 = new GrandParent2();
		
		System.out.println(GP1.method11(Test+" of "+Class));	//Running methods as object of same class
		GP1.method12(Test+" of "+Class);
		
		System.out.println(GP2.method21(Test+" of "+Class));
		GP2.method22(Test+" of "+Class);
		
		System.out.println();
	}
	
	public static void test4()
	{
		String Test="test1";
		
		GrandParent1 GP1 = new GrandParent1();					//Creating the child class object as same class type
		GrandParent2 GP2 = new GrandParent2();
		
		System.out.println(GP1.method11(Test+" of "+Class));	//Running methods as object of another class
		GP1.method12(Test+" of "+Class);
		
		System.out.println(GP2.method21(Test+" of "+Class));
		GP2.method22(Test+" of "+Class);
		
		System.out.println();
	}
	
	public String method21(String Argument)
	{
		return "Method21 of "+Class+" inside "+Argument;
	}
	
	public void method22(String Argument)
	{
		System.out.println("Method22 of "+Class+" inside "+Argument);
	}

	public String method11(String Argument) {return null;}
	
	public void method12(String Argument) {}
}
