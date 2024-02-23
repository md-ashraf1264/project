import java.util.*;
class InsetionSort
{
    public static void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
           int j=i;
                while(j>0 && arr[j]<arr[j-1])
                {
                     //swapped the number
                     int temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] =  temp;
                     j--;
                }
            }
        }
    
    public static void main(String[] args) {
        System.out.println("Program is done by MD ASHRAF");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in an array:");
        int n= sc.nextInt();
        System.out.println("Enter the element in an array");
        int arr[]= new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        insertionSort(arr);
        System.out.println("Sorting element is: ");
        System.out.println(Arrays.toString(arr));
    }
}