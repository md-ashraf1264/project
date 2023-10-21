class Plane
{
    public void disp()
    {
        System.out.println("Plane is flying");
    }
}
class  Cargoplane extends Plane
{
    //overriden method - it give only information of program line 
    @Override /* it is a inbuilt function, it give information of 
               program line as well as check correction of program line */
  public void disp()
  {
    System.out.println("Cargoplane is flying");
  }
}
class Main
{
    public static void main(String args[])
    {
        Plane sc= new Cargoplane();
         sc.disp();
    }
}