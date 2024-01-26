import java.util.*;
import java.io.*;
//Time Complexity - O(m*n)
//Space Complexity - O(1)
class PrefixSumApproch
{
    public static int  findSumMatrix(int [][] arr, int r1,int c1,int r2, int c2 )
    {
        int sum=0;
        for(int i= r1; i<=r2; i++)
        {
            for(int j=c1; j<=c2; j++)
            {
                  sum+= arr[i][j];
            }
        }
        return sum;

    } 
    public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number of rows : ");
     int m= sc.nextInt();
     System.out.println("Enter the number of column :");
    int n= sc.nextInt();
    System.out.println("Enter the element in row and column:");
    int [][]arr= new int [m][n];
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
          arr [i][j] = sc.nextInt();;
        }
    }
   
    int r1,r2, c1,c2;
    System.out.println("Enter the number of row in r1:");
    r1 = sc.nextInt();
    System.out.println("Enter the number of column in c1:");
    c1 = sc.nextInt();
    System.out.println("Enter the number of row in r2:");
    r2 = sc.nextInt();
    System.out.println("Enter the number of column in c2:");
    c2 = sc.nextInt();
   //function calling
    int result = findSumMatrix(arr,r1,c1,r2,c2);
    System.out.println("Perfix Metrix Sum is " + result);
     
   }
}
