import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
      System.out.println("This Program is made by MD ASHRAf."); 
      System.out.println("----------------------------------\n");
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of Element to be inserted:");
      int n= sc.nextInt();
      System.out.println("Enter the Element in an Array:");
      int arr[]= new int [n];
      for(int i=0; i<n; i++)
      {
            arr[i]= sc.nextInt();
      }
      for(int i=0; i<arr.length/2; i++)
      {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
      }
      System.out.println("Reverse of an array is:");
      for(int i=0; i<arr.length; i++)
      {
        System.out.println(arr[i]+ " ");
      }
      System.out.println("");
    }
}