import java.util.*;
class Student
{
    int marks;
    int age;
    String name;
    public Student(int marks , int age, String name)
    {
        this.marks= marks;
        this.age=age;
        this.name=name;
    }
    public int getMarks()
    {
        return marks;
    }
    public int getAge()
    {
        return age;
    }
    public String  getName()
    {
        return name;
    }
    public String toString ()
    {
        return ""+marks+"-"+name+"-"+age;
    }
}
class Main
{
    public static void main(String args[])
    {
        Student st1=new Student(34,32,"Rohan");
        Student st2 =new Student(43,23,"Rohit");
        Student st3=new Student(45,23,"Virat");
        ArrayList<Student> st= new ArrayList<>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        System.out.println(st);
        Comparator<Student> com=(Student a, Student b)->
        {
        if(a.age> b.age)
        return 1;
        else 
        return -1;
        };
        Collections.sort(st,com);
        System.out.println(st);
    }
}