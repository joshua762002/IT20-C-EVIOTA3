package topic_3_stack;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       Stack stack = new Stack(5);

       System.out.println("Hello there!");
       
       while(true) {
           System.out.println("Choose what you want to do: "
                    + " 1. Size"
                    + " 2. Push"
                    + " 3. Pop"
                   +  " 4. Exit");
            int choice = sc.nextInt();
        switch(choice) {
            case 1:
                      System.out.println("Stack size is: " + stack.size());
                      System.out.println("~~~~~~~~~~~~~~~~~~");
                      break;
            case 2:   
                     System.out.println("Add a number: ");
                     int num = sc.nextInt();
                     System.out.println("Pushed value: " + num);
                     stack.push(num);
                     stack.size();
                     System.out.println("~~~~~~~~~~~~~~~~~~");
                     break; 
            case 3:                   
                     stack.peek();
                     System.out.println("Popped element: " + stack.pop());
                     stack.size();
                     break;   
            case 4:
                     System.out.println("Thank you, and comeback and run it again!!");
                     System.exit(0);
                     break;
            default:
                        System.out.println("Invalid choice. Please select a valid option.");    
        }    
       }
   }       
}