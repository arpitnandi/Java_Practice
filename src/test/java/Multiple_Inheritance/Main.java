package Multiple_Inheritance;

public abstract class Main implements Connection
{
	public static void main(String[] args) {
		Connection CH1 = new Child_1();
		Connection CH2 = new Child_2();
		
		System.out.println(CH1.CH1());
		System.out.println(CH1.CH2());
		System.out.println(CH1.P1());
		System.out.println(CH1.P2());
		System.out.println(CH1.GP1());
		System.out.println(CH1.GP2());
		
		System.out.println();

		System.out.println(CH2.CH1());
		System.out.println(CH2.CH2());
		System.out.println(CH2.P1());
		System.out.println(CH2.P2());
		System.out.println(CH2.GP1());
		System.out.println(CH2.GP2());
	}
}
