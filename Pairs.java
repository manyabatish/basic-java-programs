import java.util.*;
public class Pairs{
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int t= s.nextInt();
        int c=0,k=0;
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
            if(a[j]-a[i]== t )
            {
                c++;
            }
            }
        }
        System.out.print(c);
    }
}