
/*The program you are given defines and outputs HashMap, where the names of employees are stored as keys, and their ages as values.
It also takes N number from user as age limit. Write code to delete all the employees whom age is less than N number.
The line of code for the output of HashMap object is already provided.*/

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);
        
        
        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);
        
        int ageLimit = scanner.nextInt();
        
        for (String emp : nameArr){
            //your code goes here
            if(ages.get(emp)<ageLimit)
            {
                ages.remove(emp);
            }
            
        }
        
        System.out.println(ages);
    }
}