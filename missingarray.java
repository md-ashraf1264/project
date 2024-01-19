import java.util.*;
class Missing 
{
    public static void main(String args[])
    {
        System.out.println("This Program is made by MD ASHRAF");
        System.out.println("---------------------------------\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of element in an array:");
        int n = sc.nextInt();
        System.out.println("Enter the Element in an array:");
        int arr[]= new int[n];
        for(int i=0;i<n; i++)
        {
          arr[i]= sc.nextInt();
        }
        int a = ((n+1)*(n+2))/2;
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        int missing_element= 0;
        missing_element= a-sum;
        System.out.println("Missing Element of an array is:"+ missing_element);
    }
}