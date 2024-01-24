//Write a code to add input numbers to ArrayList while the size of ArrayList isn't equal to 3 and find the average of input number

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
          int sum=0;
        while(evennums.size()<3){
            int num = scanner.nextInt();
            evennums.add(num);
            sum+=num;
            
        }
        int average = sum/evennums.size();
        System.out.println(average);
        
    }
}