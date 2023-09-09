import java.io.*;
class Ashraf
{
    public static void main (String args[]) throws IOException
    {
       File dir = new File("Knowledge With Ashraf");
       File file = new File(dir, "ashraf.txt");
       file.createNewFile();
       FileWriter f = new FileWriter(file, true);
       f.write("MD ASHRAF\n");
       f.write("want\n");
       f.write("toj\n");
       f.write("learn\n");
       f.write("java\n");
       f.write("till end \n");
       f.close();
       System.out.println("Check the file ashraf.txt to see the result");
    }
}

// If I want that not override the string values where i insert when i add some other values in next exution 
//  then we use append - true
import java.io.*;
class Ashraf
{
    public static void main (String args[]) throws IOException
    {
       File dir = new File("Knowledge With Ashraf");
       File file = new File(dir, "ashraf.txt");
       file.createNewFile();
    //    here we can use true beside of file
       FileWriter f = new FileWriter(file, true);
       f.write("MD ASHRAF\n");
       f.write("want\n");
       f.write("toj\n");
       f.write("learn\n");
       f.write("java\n");
       f.write("till end \n");
       f.close();
       System.out.println("Check the file ashraf.txt to see the result");
    }
}

