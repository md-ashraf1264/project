import java.util.*;
class Gen<T>
{
  T obj;
  public Gen(T obj)
  {
     this.obj=obj;
  }
  public void disp()
  {
    System.out.println("The type of data is" +obj.getClass().getName());
  }
  public T getObj()
  {
    return obj;
  }
}
class Main
{
    public static void main(String args[])
    {
      Gen <Integer> g= new Gen <Integer>(10);
      g.disp();
      System.out.println(g.getObj());
    }
}