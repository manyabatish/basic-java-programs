import java.util.Scanner;
public class SumOfDigits
{
public static void main(String arg[])
{
Scanner s= new Scanner(System.in);
int n,sum=0;
System.out.println("Enter the number");
int num = s.nextInt();
while(num!=0)
{
n=num%10;
sum=sum+n;
num=num/10;
}
System.out.println("Sum of digits= "+sum);
}
}