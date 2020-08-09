package earth_Drone;

import java.util.Scanner;

public class Functionalities 
{	
	private static Scanner in = new Scanner(System.in);
	private static String Switch;
	float Vth;
	protected float distenceCovered(float pulse)
	{
		float d,p;
		p = 2 * 22 / 7 * 30;
		d = p * pulse / 60;
		return d;
	}
	
	protected String mode()
	{
		String m = "";
		Switch = in.next().toUpperCase();
		m = Switch;
		return m;
	}
}
