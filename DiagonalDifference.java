import java.util.*;
import java.lang.*; 
public class DiagonalDifference {

    
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int mat[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]= s.nextInt();
            }

        }
        int d1 = 0, d2 = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                if (i == j) 
                    d1 += mat[i][j]; 
     
                if (i == n - j - 1) 
                    d2 += mat[i][j]; 
            } 
        }
        System.out.print(Math.abs(d2-d1));
       
    }
}