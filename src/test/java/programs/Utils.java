package programs;

import java.util.Scanner;

class Utils
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
	  Utils u = new Utils();

      System.out.print("Give the String : ");
      Scanner in=new Scanner(System.in);
      String S=in.nextLine();

      String[] Words=u.split(S,' ');

      for(int i=0;i<Words.length;i++)
         System.out.println("Words["+i+"] = "+Words[i]);
      
      System.out.println("S.length = "+u.count(S));
   }

   private String[] split(String S,char regex)
   {
	   int i,j=0,k=0;
	   for(i=0;i<S.length();i++)
	   {
		   if(S.charAt(i)==regex)
			   k++;
	   }
	   String[] w=new String[k+1]; 
	   w[j]="";
	   for(i=0;i<S.length();i++)
	   {
		   if(S.charAt(i)!=regex)
			   w[j]+=S.charAt(i);
		   else if(S.charAt(i)==regex)
		   {
			   j++;
			   w[j]="";
		   }
	   }
	   return w;
   }
   
   public int count(String S)
   {
	   int l;
	   String s = "";
	   l = S.compareTo(s);
	   return l;
   }
   
   
}