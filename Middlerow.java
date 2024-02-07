import java.util.*;
class Middle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Program is done by MD ASHRAF.");
        System.out.print("Enter the no of element in row:");
        int m = sc.nextInt();
        
        System.out.println("Enter the element in " + m + "*" + m + ":" );
        int arr[][] = new int [m][m];
        for(int i=0;i<m; i++)
        {
            for(int j=0; j<m;j++)
            {
                System.out.print("Enter element at postion" + "[" + i + "]" + "[" + j + "] :");
                arr[i][j] = sc.nextInt();
            }
        }
        //make a matrix 
         System.out.println("Square matrix of a given array is :");
         for(int i=0; i<m; i++)
         {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
        System.out.println();
        int MiddleRowIndex = arr.length/2; 
        System.out.println("Middle row element are:" + " ");
        for( int j=0; j<m; j++)
        {
           System.out.print(arr[MiddleRowIndex][j] + " ");
        }
        System.out.println( );

        int MiddleColumnIndex = arr.length/2; 
        System.out.println("Middle column element are:" );
        for( int i=0; i<m; i++)
        {
           System.out.println(arr[i][MiddleColumnIndex]);
        }
        sc.close();
    }
}