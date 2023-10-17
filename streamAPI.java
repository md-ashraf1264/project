import java.util.*;
import java.util.Arrays;
import java.util.stream.*;
class Demo
{
    public static void main(String args[])
    {
        // creating a array list and fill value on it 
        List<Integer> list2= Arrays.asList(43,32,23,65, 12,34);
        // use stream API
        Stream<Integer> stream1= list2.stream();
        // perfrom checkeven operating by using filter inbuilt function
        Stream<Integer> checkeven= stream1.filter(n->n%2==0);
        Stream<Integer> streamsorted= checkeven.sorted();
        // perform double operation by using map API
        Stream<Integer> streamdouble= streamsorted.map(n->n*2);
        streamdouble.forEach(n-> System.out.println(n));
    }
}