class Thread1 implements Runnable
{
    public void run()
    {
       System.out.println("Program started");
       System.out.println("Ready State");
       try
       {
       Thread.sleep(3000);
       }
    
        catch (Exception e)
        {
     System.out.println("Some error");
    }   
}
}
class Main
{
  public static void main(String args[]) throws Exception
  {
    System.out.println("Main Thread is Started"); 
    Thread1 p = new Thread1();
    Thread q = new Thread(p);
    System.out.println(q.isAlive());
    q.start(); 
    System.out.println(q.isAlive());
    q.join();
   System.out.println("Main Thread is End");
  }
}