import java.util.*;
class SquareRoot
{
    public static int squareRoot(int num)
    {
        int low = 0; int high = num; int result = -1; 
        //modified binary search
        while(low<= high)
        {
            int mid = low + (high - low)/2;
            long val = mid *mid;
        if(val == num)
        {
            //if sqaure root number is perfect
            return mid;
        }
       else if(val< num)
       {
        result = mid;
         low= mid +1;
       }
       else
       {
         high = mid -1;
       }
    }
    return result;
    }
    public static void main(String args[])
    {
        System.out.println("Program is done by MD ASHRAF." + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to get square root: ");
        int num= sc.nextInt();
        int result = squareRoot(num);
      
            System.out.println("The Square Root of  " + num + " is : " + result);
        }
}