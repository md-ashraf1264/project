// Assignment 2D Array
// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:			                  
// number of positive numbers
//  number of negative numbers
//  number of odd numbers
//  number of even numbers
//  number of 0.
//This Program is done by MD ASHRAF
import java.util.*;
import java.io.*;
class Number
{
    public static void result(int[] arr,int m, int n)
        {
            int positiveCount =0;
            int negativeCount=0;
            int zeroCount=0;
            int evenCount=0;
            int oddCount= 0;
           
            for(int num : arr)
            {
                if(num >0)
                {
                       positiveCount++;
                }
                else if(num<0)
                {
                    negativeCount++;
                }
                else 
            {
                zeroCount++;
            }
            if( num %2==0)
            {
               evenCount++;
            }
            else{
                oddCount++;
            }
            
        }
        System.out.println("Number of Positive number " + positiveCount);
            System.out.println("Number of negative number " + negativeCount);
            System.out.println("Number of zeros " + zeroCount);
            System.out.println("Number of even number " + evenCount);
            System.out.println("Number of odd number " + oddCount);
        }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m= sc.nextInt();
        System.out.print("Enter the number of column: ");
        int n= sc.nextInt();
        int arr[] = new int [m*n];
        for(int i=0; i<m*n; i++)
        {
            System.out.print("Enter Integer" + (i+1) + ":");
            arr[i]= sc.nextInt();
        }
        result(arr,m,n);  
    }
}