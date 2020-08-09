package programs;

public class Collect_Unique_Words
{
  public static void main(String ars[])
  {
   int space=0,i,j,k,l=0,m=0;
   String Sentance="Test if String is Collecting Unique String or not not";
   System.out.println("Original String");
   System.out.println(Sentance);
   for(i=0;i<Sentance.length();i++)
   {
     if(Sentance.charAt(i)==32)
       space++;
   }
   String words[]=new String[space+1];
   for(i=0,k=i;i<Sentance.length();i++)
   { 
      if(Sentance.charAt(i)==32||i==Sentance.length()-1)
      {
         if(l==space)
            j=Sentance.length();
         else
            j=i;
         words[m]=Sentance.substring(k,j);
         m++;
         k=i+1;
       }
    }
    for(i=0;i<words.length;i++)
    {
      for(j=i+1;j<words.length;j++)
      {
        if(words[j].equals(words[i]))
          words[i]=null;
      }
    }
    System.out.println("String without duplicates");
    for(l=0;l<words.length;l++)
    {
      if(words[l]!=null)
        System.out.print(words[l]+" ");
    }
  }
}