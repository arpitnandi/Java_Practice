package programs;

public class TowerOfHanoi 
{
	static TowerOfHanoi t = new TowerOfHanoi();
	
	public static void main(String[] args) 
	{
		int pattern[][] = new int[3][3];
		
		t.game(pattern,3,7);
	}
	
	private int print(int arr[][],int l)
	{
		int a,level;
		System.out.println("\n");
		for(int i = 0 ; i < l ; i++)
		{
			for(int j = 0; j < l ; j++)
			{
				a = arr[j][i];
				for(int k = 0 ; k < 4 - a / 2 ; k++)
					System.out.print("  ");
				for(int k = 0 ; k < a ; k++)
					System.out.print("[]");
				for(int k = 0 ; k < 7 - a / 2 ; k++)
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int j = 0 ; j < l ; j++)
		{
			for(int i = 0 ; i < l * 2 + 2 ; i++)
				System.out.print("==");
			for(int i = 0 ; i < l ; i++)
				System.out.print("  ");
		}
		level = l + 1;
		return level;
	}
	
	private String game(int arr[][],int l,int r)
	{
		String message;
		for(int p = 0 ; p < r * 2 + 2 ; p++)
		{
			t.print(arr,l);
		}
		message = ""+l;
		return message;
	}
}
