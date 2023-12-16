import java.util.*;
class Thread1 extends Thread
{
    public void run()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Child Thread1");
    System.out.println("Enter first number");
    int t = sc.nextInt();
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Child Thread2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Second number");
        int t2 = sc.nextInt();
    }
}
class Main
{
    public static void main(String args[])
    {
      System.out.println("Main Thread");
      Thread1 t3= new Thread1();
      t3.start();
      Thread2 t4= new Thread2();
      t4.start();
    }
}