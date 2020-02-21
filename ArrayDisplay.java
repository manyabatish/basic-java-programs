import java.util.*;
public class ArrayDisplay
{
public static void main(String args[])
{
Scanner s= new Scanner(System.in);
int n= s.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++)
{
a[i]= s.nextInt();
}
String str= Arrays.toString(a);
System.out.print(str);
}
}