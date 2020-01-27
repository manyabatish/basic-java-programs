import java.util.*;
public class Anagram {
     public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        String s1= s.next();
        String s2= s.next();
        int c=0;
        char str1[]= s1.toCharArray();
        char str2[]= s2.toCharArray();
        if(s1.length() == s2.length())
        {
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0;i<s1.length();i++)
        {
            if(str1[i]==str2[i])
            {
               c++;
            }
        }
        if(c==s1.length())
        {
            System.out.print("Alagram");
        }
        else
        {
             System.out.print("Not alagram");
        }
        }
        else 
        {
            System.out.print("Not alagram");
        }
        
    }
}