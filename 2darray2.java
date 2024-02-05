import java.util.*;
class Diagonal
{   
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range of square matrix : ");
        int m = sc.nextInt();
       
         int arr[][]= new int[m][m];
        //  user input
        System.out.println("Enter the element of square matrix: " + m +"*"+ m);
          for(int i=0; i<m; i++)
          {
            for(int j=0;j<m; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        //print the 2d array
        System.out.println("Element of an array in Square Matrix is: ");
        for(int i=0; i<m; i++)
        {
          for(int j=0;j<m; j++)
          {
              System.out.print(  arr[i][j] + " ");
          }
          System.out.println( );
        }
        //  print the diagonal
        System.out.println("Elements above the secondary diagonal is: ");
          for(int i=0; i<m; i++)
          {
            for(int j=0; j<m; j++)
            {
                if(i+j == m-1 || i == j )
         {
            System.out.println(arr[i][j]);
         }
            }
           
          }
          sc.close();
        }
    }