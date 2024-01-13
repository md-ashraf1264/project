class Thread1 implements Runnable
{
   public void run()
    {
        try
        {
             System.out.println(Thread.currentThread().getName() + "Go and take car from the parking slot");
            Thread.sleep(3000);
             synchronized(this)
            {
             System.out.println(Thread.currentThread().getName() + "start driving the car");
             Thread.sleep(3000);
             System.out.println(Thread.currentThread().getName() + "and then park the car in the parking slot");
              Thread.sleep(3000);
            }

    }
        catch(Exception e)
        {
                  System.out.println("some errors");
        }
    }
}
class Main
{
   public static void main(String args[])
   {
     Thread1 th= new Thread1();
     Thread t1 = new Thread(th);
     Thread t2 = new Thread(th);
     Thread t3 = new Thread(th);
     t1.setName("SON-1");
     t2.setName("SON-2");
     t3.setName("SON-3");
     t1.start();
     t2.start();
     t3.start();
   }
}