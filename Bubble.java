import java.util.*;
class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        boolean swapped =false;
      
       for(int i=0; i<arr.length; i++)
       {
        for(int j=0; j<arr.length-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
             arr[j]= arr[j+1];
             arr[j+1]=temp;

            swapped = true;
            }
        }
        if(!swapped)
        {
        break;
        }
       }
    }
    public static void main(String[] args) {
        System.out.println("Program is done by MD ASHRAF");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element");
        int n = sc.nextInt();
        System.out.println("Enter the Element in an array:");
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
     {
        arr[i]= sc.nextInt();
     }
     bubbleSort(arr);
     System.out.println("Sorted array is: " );
     System.out.println(Arrays.toString(arr));
    }
}