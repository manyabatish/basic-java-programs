import java.util.*;
public class AlternatingCharacters
{
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int count=0;
        for(int k=0;k<n;k++)
        {
        String s1= s.next();
        for(int i=0;i<s1.length()-1;i++)
        {
                if(s1.charAt(i)== s1.charAt(i+1))
                {
                    count ++;
                }
        }
            System.out.println(count);
            count=0;
        }
    }
}
