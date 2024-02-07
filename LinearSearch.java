import java.util.*;
class Searching
{
    public static void main(String args[])
    {
        System.out.println("Program is done by MD ASHRAF.");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of element:");
        int n = sc.nextInt();
        System.out.println("Enter the element in an array:");
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        
        //Targeting the element
        System.out.println("Enter target element:");
        int x = sc.nextInt();

        //searching the element
        int idx= -1;
        for(int i=0; i<n; i++)
       {
        if(arr[i]==x)
        {
            idx= i;
            break;
        }        
    }
    if(idx==-1)
    {
        System.out.println("Element is not found in an array.");
    }
    else
    System.out.println("Element is found at location :" + idx);
    }
}