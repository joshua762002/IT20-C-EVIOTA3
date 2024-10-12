/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_2_linkedlist_string;

/**
 *
 * @author Joshua
 */
public class Main {

    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();

        // Adding elements to the list with new artist names
        list.add("The Beatles - Hey Jude");
        list.add("Elton John - Rocket Man");
        list.add("Billie Eilish - Bad Guy");
        list.add("Adele - Rolling in the Deep");
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        
        // Delete
        list.deleteByValue("Elton John - Rocket Man");
        System.out.println();
        System.out.println("Deleting |Elton John - Rocket Man| from the list...");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        
        // Move/Swap Pointer
        System.out.println();
        System.out.println("Moving/Swapping node from index 1 to index 0");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.moveNodePointer(0, 1);
        list.printList();
    }

}

