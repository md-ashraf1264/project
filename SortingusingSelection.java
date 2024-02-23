import java.util.*;
class SelectSort
{
    public static void selectionSort(int arr[])
    {
         for(int i=0; i<arr.length; i++)
         {
            //storing minimum index at minimum value at every iteration
              int min_indx = i;
              for(int j=i+1; j<arr.length; j++)
              {
                 if(arr[j]< arr[min_indx])
                 {
                    min_indx = j;
                 }
              }
              if(min_indx !=i)
              {
                int temp = arr[min_indx];
                arr[min_indx]= arr[i];
                arr[i]=temp;
              }
         } 
    }
    public static void main(String[] args) {
        System.out.println("Program is done by MD ASHRAF.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in an array:");
        int n = sc.nextInt();
        System.out.println("Enter the element:");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}