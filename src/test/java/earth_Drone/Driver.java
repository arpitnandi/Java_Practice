package earth_Drone;

import java.util.*;

public class Driver extends Functionalities
{
	private static Scanner in = new Scanner(System.in);
	private static Functionalities o = new Driver();
	private static float pulse;
	private static float d;
	private static String status;

	public static void main(String[] args) 
	{
		System.out.println("On/Off : ");
		status = o.mode();
		System.out.println("System "+status);
		
		while( status.equals("ON") && !status.equals("OFF") )
		{	
			System.out.print("pulse : ");
			pulse = Float.parseFloat(in.next());
			
			if( pulse >= 0.7 )
			{
				d += o.distenceCovered(pulse);
				System.out.println("Moving");
				System.out.println("Distence Covered = "+d);
			}
			if( pulse > 0.3 && pulse <= 0.4 )
			{
				status = "ON";
				System.out.println("Stoped");
			}
			if( pulse < 0.3 )
			{
				status = "OFF";
				System.out.println("Shut Down");
			}
		}
	}
}
