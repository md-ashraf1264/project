class Thread1 extends Thread
{
    public void run()
    {
       String tName=  Thread.currentThread().getName();
       if(tName.equals("CAL1"))
       {
        cal1();
       }
       else{
        cal2();
       }
    }
    public void cal1()
    {
        System.out.println("This is the first Thread");
    }
    public void cal2()
    {
        System.out.println("This is the second Thread");
    }
}
class Main
{
   public static void main(String args[])
   {
    System.out.println("Main Thread");
    Thread1 thread1 = new Thread1();
    Thread1 thread2= new Thread1();
    thread1.setName("CAL1");
    thread2.setName("CAL2");
    thread1.start();
    thread2.start();
   }
}