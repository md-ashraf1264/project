// Q4: Write a program to find the largest element of a given 2D array of integers. 
  
import java.util.*;
class LargestNumberIn2dArray
{
    public static int result(int arr[][],int a, int  b )
    {
        int max =arr[0][0];
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<b; j++)
            {
               if(max<arr[i][j])
               {
                max=arr[i][j];
               }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the no of element of rows:");
      int a = sc.nextInt();
      System.out.print("Enter the no of element of column:");
      int b = sc.nextInt();
      System.out.println("Enter the element in an array: ");
      int arr[][]  = new int[a][b];
      for(int i=0; i<a; i++)
      {
        for(int j=0;j<b;j++)
        {
            arr[i][j] = sc.nextInt();
        }
      }
      System.out.print("Largest Element in 2d Array is : " + result(arr, a, b));
    }
}