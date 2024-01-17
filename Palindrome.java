import java.util.*;
class Check
{
    public static void main(String args[])
    { 
        int flag=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element of an array:");
        int a = scanner.nextInt();
        System.out.println("Enter the element:");
        int arr[]= new int[a];
        for(int i=0; i<a; i++)
        {
            arr[i]= scanner.nextInt();
        }
        for(int i=0; i<arr.length/2; i++)
        {
            if(arr[i]!= arr[arr.length-i-1])
            {
                flag=1;
              System.out.println("Number is not Palindrome");
              break;
            }
        }
         if(flag==0)
                System.out.println("Number is Palindrome");
         
        }
    }