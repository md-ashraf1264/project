import java.util.*;
class BinarySearch
{
    public static int binarySearch(int []arr, int target)
    {
        int low=0; int high= arr.length-1;
        while(low<=high)
        {
           int  mid= low + (high-low)/2;
        if(arr[mid]== target)
        {
           return mid;
        }
        else if(arr[mid]<target)
        {
            low = mid+1;
        }
        else 
        {
            high = mid-1;
        }
    }
    return 0;
    }
    public static void main(String args[])
    {
        System.out.println("Program is done by MD ASHRAF");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of  element in an array:");
        int n = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter target element :");
        int x= sc.nextInt();

       int result= binarySearch(arr,x);
       if(result == 0)
       {
        System.out.println("Element is not found in binary search." );
       }
       else{
        System.out.println("Element is found at position : " + result);
       }
    }
}