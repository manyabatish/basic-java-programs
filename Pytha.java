import java.util.*;
public class Pytha
{
    public static boolean isPytha(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int x= a[i]*a[i] , y= a[j]*a[j] , z= a[k]*a[k];
                    if(x+y==z || y+z== x || x+z==y)
                    {
                        return true;
                    }
                    
                }
            }
            
        }
        return false;
    }
    
public static void main(String arg[])
{
Scanner s= new Scanner(System.in);
int n= s.nextInt();
int a[]= new int[n];
for(int i=0;i<n;i++)
{
    a[i]= s.nextInt();
}
if(isPytha(a,n)==true)
{
    System.out.print("true");
}
else 
System.out.print("false");
}
}