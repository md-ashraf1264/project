import java.util.*;
class Main
{
    public static void main(String args[])
    {
       ArrayList st= new ArrayList();
       st.add(49);
       st.add(47);
       st.add(58);
       st.add(48);
       st.add(213);
       st.add(84);
       System.out.println(st);
       Collections.sort(st);
       System.out.println(st);
       ArrayList<String > gt=new ArrayList<String >();
       gt.add("khan");
       gt.add("the way");
       gt.add("great");
       gt.add("humper");
       System.out.println(gt);
       Collections.sort(gt);
       System.out.println(gt);
       ArrayList<String > gt1=new ArrayList<String >();
       gt1.add("khan");
       gt1.add("the way");
       gt1.add("great");
       gt1.add("humper");
       int index=Collections.binarySearch(gt1, "the way");
       System.out.println("Index is " + index);
       ArrayList<String > gt2=new ArrayList<String >();
       gt2.add("khan");
       gt2.add("the way");
       gt2.add("great");
       gt2.add("humper");
       Collections.shuffle(gt2);
       System.out.println(gt2);
    }
}