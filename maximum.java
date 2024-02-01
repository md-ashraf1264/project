import java.util.*;
class Maximum
{
    public static int max(int arr[])
    {
        int max = arr[0];
    for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i] )
            {
               max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of  element of an array:");
        int n = sc.nextInt();
        System.out.println("Enter the element in an array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }   
        System.out.println( "Maximum element in an array is: " + max(arr));   
    }
}