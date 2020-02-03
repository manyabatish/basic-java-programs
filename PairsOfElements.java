import java.util.*;
public class PairsOfElements {
  public static void checkPair(int a[],int num)
  {
    for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(a[i]+a[j]==num)
        {
          System.out.println(a[i] +" +" + a[j] +" ="+num);
        }
      }
    }
  }
  public static void main(String[] args) {
  Scanner s= new Scanner (System.in);
  int n= s.nextInt();
  int a[]= new int[n];
  for(int i=0;i<n;i++)
  {
    a[i]= s.nextInt();
  }
  int num= s.nextInt();
  checkPair(a,num);
 }
}