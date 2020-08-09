package programs;

public class Biggest
{
	public static void main(String[] args)
	{
		int I[]={23,27,45,75,135,23,64,13,96,21,56};
		int J;
		
		J = Biggest.biggest(I);
		
		System.out.print(J);
	}
	
	private static int biggest(int arr[]) 
	{
		int big=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(big<arr[i])
				big=arr[i];
		}
		return big;
	}
}