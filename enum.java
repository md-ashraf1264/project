enum Week
{
    MON,TUE, WED, THU, FRI,SAT,SUN;
}
class enumcheck
{
    enum Color
    {
        BLACK, RED, GREEN, BLUE;
    }
    public static void main(String args[])
    {
        Week w= Week.MON;
        System.out.println(w);
        int cr= Color.BLACK.ordinal();
        System.out.println(cr);
       Week []br= Week.values();
       for(Week ws:br)
       {
        System.out.println(ws + ":" + ws.ordinal());
       }
    }
}