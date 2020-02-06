import java.util.* ;
public class TwoStrings
{
public static void main(String arg[])
{
String s1,s2;
    int n;
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
  for(int k=0;k<n;k++)
    {    
    int flag = 0;
        s1=s.next();

    s2=s.next();
    for(int i=0;i<s1.length();i++)
    {
        for(int j=i;j<s2.length();j++)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                flag=1;
            }
        }
    }


        if(flag==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
}}
}