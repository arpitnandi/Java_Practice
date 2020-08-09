package Method_Overriding;


public class Descendant extends Parent
{
	static String Class="Descendant";
	
	public static void main(String[] args)
	{
		Parent.test1();
		Parent.test2();
		Parent.test3();
		Parent.test4();

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
		String Test="test4";
		
		GrandParent1 GP1 = new GrandParent1();					//Creating the child class object as same class type
		GrandParent2 GP2 = new GrandParent2();
		
		System.out.println(GP1.method11(Test+" of "+Class));	//Running methods as object of another class
		GP1.method12(Test+" of "+Class);
		
		System.out.println(GP2.method21(Test+" of "+Class));
		GP2.method22(Test+" of "+Class);
		
		System.out.println();
	}
}
