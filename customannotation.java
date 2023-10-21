import java.lang.annotation.*;
// making custom Annotaion to write their target and their rentention
@Target({ElementType.TYPE,ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    // we pass some variable and their vales
    String Country() default "India";
    int Age() default 32;

}

@CricketPlayer
class virat 
{
    @CricketPlayer
   private int innings;
   private int runs;

   @CricketPlayer
   public void  setInnings(int innings)
   {
     this.innings = innings;
    
   }
   public void  setInning( int runs)
   {
     
     this.runs=runs;
   }
   public int getInnings()
   {
         return innings;       
   }
   public int getInning()
   {
      return runs;
   }
}
class Main 
{
    public static void main(String args[])
    {
        virat sc = new virat();
        sc.setInning(2000);
        sc.setInnings(50);
        System.out.println(sc.getInning()); 
        System.out.println(sc.getInnings());   
        
        // calling the values that we write in Annotation
         Class c = sc.getClass();
        Annotation an=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp= (CricketPlayer)an;
        String Country = cp.Country();
        System.out.println(Country);
        int Age= cp.Age();
        System.out.println(Age);
    }
}