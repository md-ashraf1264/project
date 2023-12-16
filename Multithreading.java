class Multithreading 
{
    public static void main( String args[])
    {
        System.out.println("Before changing");
        System.out.println("Main Threads");
        String name = Thread.currentThread().getName();
        System.out.println("Name of the current Thread is:-"+ name);
        System.out.println("The priority of current thread is " + Thread.currentThread().getPriority());
         System.out.println("After changing");
         Thread t = Thread.currentThread();
        t.setName("Saif");
        t.setPriority(2);
        String name2= Thread.currentThread().getName();
        System.out.println("Name of the changing Thread is " + name2);
        System.out.println("The changing priority of thread is " + Thread.currentThread().getPriority());  
    }
}