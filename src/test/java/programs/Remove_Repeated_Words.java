package programs;

import java.util.*;

@SuppressWarnings("resource")
class Remove_Repeated_Words
{
	public static void main(String ars[])
	{
		// "Unth uncha unth ki pith unchi unth ki punchch unchi"
		
		System.out.print("Give the String : ");
		Scanner in=new Scanner(System.in);
		String Sentance=in.nextLine();
		
		System.out.print("Original String => ");
		System.out.println(Sentance);
		
		System.out.print("\nString without repeats :\n\nWith Inbuilt methods => ");
		for(String S:Remove_Repeated_Words.withoutRepeats1(Sentance))
			System.out.print(S+" ");
		
		System.out.print("\n\nWithout Inbuilt methods => ");
		for(String S:Remove_Repeated_Words.withoutRepeats2(Sentance))
			System.out.print(S+" ");
	}
	
	private static LinkedHashSet<String> withoutRepeats1(String S)
	{
		// Splits the String
		String words[]=S.split(" ");
		
		// Removes the repeated words
		Set<String> l=new LinkedHashSet<String>();
		for(int i=0;i<words.length;i++)
			l.add(words[i]);
		
		return (LinkedHashSet<String>) l;
	}
	
	private static List<String> withoutRepeats2(String S)
	{
		int i,j;
		
		String word="";
		List<String> l= new ArrayList<String>();
		
		// Splits the String
		for(i=0;i<S.length();i++)
		{
			if(S.charAt(i)!=32)
				word+=S.charAt(i);
			if(S.charAt(i)==32 || i==S.length()-1)
			{
				l.add(word);
				word="";
			}
		}
		
		// Removes the repeating words
		for(i=0;i<l.size();i++)
		{
			for(j=i+1;j<l.size();j++)
			{
				if(l.get(i).equalsIgnoreCase(l.get(j)))
				{
					l.remove(j);
					j--;
				}
			}
		}
		
		return l;
	}
}