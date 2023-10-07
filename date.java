class Date
{
    public static void main(String args[])
    {
    //  represent date by using util package  
     java.util.Date sc= new  java.util.Date();
     System.out.println(sc);
    //  represent date by using sql package 
     long  timeInMs =  sc.getTime();
     java.sql.Date dt1= new java.sql.Date(timeInMs);
     System.out.print(dt1);
    }
}
