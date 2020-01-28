import java.util.*;
public class StringReverse 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str= s.next();
		char c[]= str.toCharArray();
		int n= str.length();
		for(int i= n-1;i>=0;i--)
			{
				System.out.print(c[i]);
			}
}
}