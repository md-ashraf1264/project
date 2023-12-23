import java.util.*;
class MyThread implements Runnable
{
     public void run()
     {
        System.out.println("First Thread");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int t1= sc.nextInt();
        System.out.println("first thread end ");
     } 
}
class MyThread1 implements Runnable
{
    public void run()
    {
        System.out.println("Second Thread");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Second number");
        int t2 = sc.nextInt();
        System.out.println("Second thread end ");
    }
}
class Main
{
    public static void main(String args[])
    {
      MyThread t1= new MyThread();
      MyThread1 t2= new MyThread1();
      Thread t3 = new Thread(t1);
      Thread t4 = new Thread(t2);
      t3.start();
      t4.start();
    }
}