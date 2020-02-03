import java.io.*; 
  
class PushZeros
{ 
    static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;
   
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i];
        while (count < n) 
            arr[count++] = 0; 
    }
    public static void main (String[] args) 
    { 
        int a[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        int n = a.length; 
        pushZerosToEnd(a, n); 
        System.out.println("After pushing zeros to the back: "); 
        for (int i=0; i<n; i++) 
            System.out.print(a[i]+" "); 
    } 
}