import java.util.*;
public class MaxCount {
public static void main (String args[])
{
	String str;
	Scanner s = new Scanner(System.in);
	str=s.nextLine();
	char[] ch = str.toCharArray();
	int max=0,count=0;
	int[] m = new int[100];
	Arrays.sort(ch);
	for(int i=0 ; i<ch.length ; i++) 
	{
		count =0;
	   for(int j=0;j<ch.length;j++)
	   {
		   if(ch[i]==ch[j])
		   {
			   count++;
		   }
		   m[i]= count;
	   }
	   }
	max= m[0];
	for(int i=0; i<m.length;i++)
	{
		if(max<m[i])
		{
			max= m[i];
		}
	}
	System.out.print(max);
	}
}
