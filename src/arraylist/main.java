/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;
import java.util.Scanner;
/**
 *
 * @author Joshua
 */
public class main {
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        //Creating object of the class to access all the methods on the Item Manager
        itemmanager list = new itemmanager();
        
        //Inializing variables 
        String item, newItem, finditem;
        int index;
        
        //Displays the list
        list.displayItems();
    
        //To read and store the input in the variable named item
        System.out.println("Enter an item you want to add: ");
        item = sc.nextLine();
        //Displays the new Item
        list.addItems(item);
        System.out.println("~~~~~~~~");
        
        //To read and store the input in the variable named index
        System.out.println("Enter an index number that you want to change: ");
        index = sc.nextInt(); 
        //Calling so that it reads the input of the next (String) line
        sc.nextLine();
        //To read and store the input in the variable named newItem
        System.out.println("Enter a new name that you want to change on that index number: ");
        newItem = sc.nextLine();
        //Displays the updated item
        list.updateItem(index, newItem);
        list.displayItems();
        System.out.println("~~~~~~~~");

        //To read and store the input in the variable named findItem
        System.out.println("Enter a name that you want to find: ");
        finditem = sc.nextLine();
        //Displays the item you want to find
        list.findItem(finditem);
        list.displayItems();
        System.out.println("~~~~~~~~");
        
        //To read and store the input in the variable named newIndex
        System.out.println("Enter an index number to delete: ");
        int newIndex = sc.nextInt();
        //Displays the item you want to delete
        list.deleteItem(newIndex);
        list.displayItems();
        sc.close();
    }
}

