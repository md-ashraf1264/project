import java.io.*;
import java.util.*;
class BinarySearch
{
    public static int binarySearch(int[] arr, int target)
    {
           int low =0;
           int high= arr.length-1;
           while(low<=high)
           {
            int mid= low +(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else {
                low = mid-1;
            }
           }
           return 0;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element in an array :");
        int n = scanner.nextInt();
        System.out.println("Enter the element :");
        int[] arr = new int [n];
        for(int i=0;i<n; i++)
        {
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the target value:");
        int target  = scanner.nextInt();
        int result= binarySearch(arr, target);
        if(result!=0)
        {
            System.out.println("Element is found at the index of " + result);
        }
        else{
            System.out.println("Element is not found ");
        }
    }
}