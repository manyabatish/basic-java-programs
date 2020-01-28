import java.util.*;
public class Fibonacci {
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int sum=0, x=0, y=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(y+" ");
            sum= x+y;
            x=y;
            y= sum;
        }
        
    }
}