import java.util.*;
import java.io.*;
class OptimizedApproach
{
    public static void PrefixSumMatrix(int [][]arr)
        {
            int m = arr.length;
            int n = arr[0].length;
            //traversed the array into row wise 
            for(int i=0; i<m; i++)
            {
                for(int j=1; j<n; j++)
                {
                    arr[i][j] += arr[i][j-1];
                }
            }
            //traversed the array into column wise 
                for(int j=0; j<n; j++)
                {
                    for(int i=1; i<m; i++)
            {
                    arr[i][j] += arr[i-1][j];
                }
            }
        }
    public static int  sumRegion(int arr[][], int r1, int c1, int r2, int c2)
    {
       int sum =0; int up =0; int left=0; int repeated_region =0; int result=0;
       sum = arr[r2][c2];
       up = arr[r1-1][c2];
       left= arr[r2][c1-1];
       repeated_region = arr[r1-1][c1-1];
       result = sum-up-left+repeated_region;
      return result;
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int m = sc.nextInt();
        System.out.println("Enter the number of column:");
        int n = sc.nextInt();
        System.out.println("Enter the element of rows and column in Matrix:");
        int arr[][] = new int [m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++ )
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int r1, c1, r2,c2;
        System.out.println("Enter the coordinates of r1:");
        r1 = sc.nextInt();
        System.out.println("Enter the coordinates of c1:");
        c1 = sc.nextInt();
        System.out.println("Enter the coordinates of r2:");
        r2 = sc.nextInt();
        System.out.println("Enter the coordinates of c2:");
        c2 = sc.nextInt();
  
        PrefixSumMatrix (arr);
        int result = sumRegion(arr, r1,c1,r2,c2);
        System.out.println(result);
        
    }
}