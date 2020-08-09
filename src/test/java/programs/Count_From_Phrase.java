package programs;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Count_From_Phrase
{
	public static void main(String args[])
	{
		// "Appium supports : 1) java, 2) Python, 3) C#, 4) Ruby, 5) PHP & 6) Java Script"
		
		Scanner in=new Scanner(System.in);
		int sentences=0,space=0,upper=0,lower=0,specialChar=0,number=0,symbol=0;
		
		String Phrase;
		System.out.print("Give the String:");
		Phrase=in.nextLine();
		
		if(!Phrase.isEmpty())
			sentences++;
		
		for(int i=0;i<Phrase.length();i++)
		{
			if(i<Phrase.length()-2&&Phrase.substring(i,i+2).equals(". "))
				sentences++;
			if(Phrase.charAt(i)==32)
				space++;
			if(Phrase.charAt(i)>64&&Phrase.charAt(i)<91)
				upper++;
			if(Phrase.charAt(i)>95&&Phrase.charAt(i)<123)
				lower++;
			if(Phrase.charAt(i)>47&&Phrase.charAt(i)<58)
				number++;
			if(Phrase.charAt(i)>127&&Phrase.charAt(i)<255)
				symbol++;
			if(Phrase.charAt(i)>32&&Phrase.charAt(i)<48||Phrase.charAt(i)>57&&Phrase.charAt(i)<65||Phrase.charAt(i)>90&&Phrase.charAt(i)<97||Phrase.charAt(i)>122&&Phrase.charAt(i)<127)
				specialChar++;
		}
		System.out.print("\nTotal Charaters="+(space+upper+lower+number+symbol+specialChar)+"\nSentences="+sentences+"\nWords="+(space+1)+"\nSymbols="+symbol+"\nNumbers="+number+"\nSpecial Characters="+specialChar+"\nTotal Letters"+(upper+lower)+"\nCapital Letters="+upper+"\nSmall Letters="+lower);
   }
}