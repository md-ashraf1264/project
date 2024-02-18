import java.util.*;
class LowerBond
{
    public static int findFirstOccurance(int arr[], int a)
        {
            int low = 0; int high = arr.length -1;
           int  result = -1;
            while(low<= high)  //avoid overflow
            {
                int mid = low + (high - low)/2;
                if(arr[mid]==a)
                {
                     result = mid;
                     high = mid-1;
                }
                else if (arr[mid]>a)
                {
                    high = mid - 1;
                }
                  else 
                  {
                    low = mid + 1;
                  }
            }
            return result;
        }
    public static void main(String args[])
    {
        System.out.println("Program is done by MD ASHRAF");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element to be entered: ");
        int n= sc.nextInt();
        System.out.println("Enter the no of element in an array: ");
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number: ");
        int a = sc.nextInt();

        int result= findFirstOccurance(arr,a);
        if(result == -1)
        {
            System.out.println("Target element is not found: ");
        }
        else
        {
            System.out.println("Target element is: " + result);
        }
    }
}