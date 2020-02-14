import java.util.Scanner;
class SpiralMatrix
{        
static void spiral(int row,int col,int a[][])
{
int i,k=0,l=0;
while(k<row&&l<col)
{  
for(i=l;i<col;i++)
{
System.out.print(a[k][i]+" ");
}
k++;
for(i=k;i<row;i++)
{
System.out.print(a[i][col-1]+" ");
}
col--;
if(k<row)
{
for(i=col-1;i>=l;i--)
{
System.out.print(a[row-1][i]+" ");
}
row--;
}
if(l<col)
{
for(i=row-1;i>=k;i--)
{
System.out.print(a[i][l]+" ");
}
l++;
        }
    }
}  
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array");
    int n=s.nextInt();
int row=n;
        int col=n;
        int a[][]= new int[n][n];
        int i,j;
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
        a[i][j]=s.nextInt();
        }
        }
        if(n<0||n==0)
        {
        System.out.print("Invalid Input");
        }
        else if(n==1)
        {
        for(i=0;i<n;i++)
        {
        System.out.print(a[i][i]);
        }
        }
        else
        {
System.out.println("Solution:");
        spiral(row,col,a);
    }  
}
}