/*
You want to plan your day and create your to do list.
Complete the program to take the names of 3 tasks as input and write them down in the file "tasks.txt", each on a new line.
*/

Then use the readFile() method to output the tasks.
import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while(count < 3) {
                //your code goes here
                f.format("%s", (input.nextLine()+"\n"));
                
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

      public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
      }
}