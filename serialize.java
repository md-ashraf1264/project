import java.io.*;
class Ashraf
{
    public static void main(String args[]) throws IOException
    {
        File dir = new File("Knowledge With Ashraf");
        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("The directoy referring 'Knowledge With Ashraf' -"+ dir.isDirectory());
        File file= new File(dir,"the art of knowledge");
        file.createNewFile();
        System.out.println("The File referring 'the art of knowledge' -" + file.isFile());
        //checking the numbers of file in a single directory
        int count= 0;
        String s= "Knowledge With Ashraf";
        File f= new File(s);
        String str[] = f.list();
        for(String name:str)
        {
           count++;
           System.out.println(name);
        }
        System.out.println("Number of file are " + count);
    }
}