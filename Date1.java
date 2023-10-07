import java.time.*;
class Date
{
  public static void main(String args[])
  {
    LocalDate date=LocalDate.now();
    System.out.println(date);
    // let customize the date into day/month/year
    int day=date.getDayOfMonth();
    int Month=date.getMonthValue();
    int year = date.getYear();
    System.out.println(day +"/" + Month+"/" + year );
    // let customise the time into hour/min/sec
    LocalTime time= LocalTime.now();
    System.out.println(time);
    int Hour =time.getHour();
    int min = time.getMinute();
    int sec= time.getSecond();
    System.out.println(Hour +":" + min +":" + sec);
  }
}