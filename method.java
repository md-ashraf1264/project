import java.util.*;
class Method
{
  static void bot()
  {
    Scanner sc= new Scanner (System.in);
    String input[]={"pasta", "burger","pizza","biryani","Try again"};
    int x = sc.nextInt();
    if(x<0  || x>3)
    {
        x=4;
    }
    System.out.println(input[x]);
  }
  public static void main(String args[])
  {
    bot();
  }
}