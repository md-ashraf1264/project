import java.io.*;
class Ashraf
{
    public static void main(String args[]) throws IOException
   {
       File dir = new File("Knowledge With Ashraf");
       File file = new File(dir,"ashraf.txt");
       FileReader fd = new FileReader(file);
       int i = fd.read();
       while(i!=-1)
       {
         System.out.print((char)i);
         i=fd.read();
       }
    }
}