class Thread2 implements Runnable
{
     String res1= new String ("JAVA");
     String res2 = new String ("SQL");
     String res3= new String ("DSA");
     public void run()
     {
        
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
         try
         {
             Thread.sleep(3000);
             synchronized(res1)
             {
                System.out.println("Student1 has acquired " + res1);
                Thread.sleep(3000);
                synchronized(res2)
                {
                    System.out.println("Student1 has acquired " + res2);
                    Thread.sleep(3000);
                    synchronized(res3)
                    {
                        System.out.println("Student1 has acquired " + res3);
                        Thread.sleep(3000);
                    }
                }
             }
         }   
         catch(Exception e)
         {
            System.out.println("some problems");
         }
        }
        else
        {
            try
         {
             Thread.sleep(3000);
             synchronized(res3)
             {
                System.out.println("Student2 has acquired " + res3);
                Thread.sleep(3000);
                synchronized(res2)
                {
                    System.out.println("Student2 has acquired " + res2);
                    Thread.sleep(3000);
                    synchronized(res1)
                    {
                        System.out.println("Student2 has acquired " + res1);
                        Thread.sleep(3000);
                    }
                }
             }
         }   
         catch(Exception e)
         {
            System.out.println("some problems");
         }

        }
     }
}
class Main
{
    public static void main(String args[])
    {
        Thread2 th= new Thread2();
        Thread t1= new Thread(th);
        Thread t2 = new Thread(th);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();

    }
}