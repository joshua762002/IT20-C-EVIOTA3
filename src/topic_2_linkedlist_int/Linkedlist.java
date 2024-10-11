package topic_2_linkedlist_int;
/**
 *
 * @author ITLAB1-PC11-STUDENT
 */
public class Linkedlist {
    
    private Node head; 
    
        // Method to add a new node in the list
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        
        // Method to delete a node by value
        public void deleteByValue(int value) {
            if (head == null) return;

            // If the head needs to be removed
            if (head.data == value) {
                head = head.next;
                return;
            } else if(head.data != value) {      
                
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data == value) {
                    current.next = current.next.next; 
                    return;
                }
                current = current.next;
            }
        }
        
        //Method to swap items in the list
        public void swapNodes(int index1, int index2) {
            
            if (head == null || index1 == index2) return;

            Node current1 = head;
            Node prev1 = null;
            Node current2 = head;
            Node prev2 = null;

            // Find the first node and its previous node
            for (int i = 0; current1 != null && i < index1; i++) {
                prev1 = current1;
                current1 = current1.next;
            }

            // Find the second node and its previous node
            for (int i = 0; current2 != null && i < index2; i++) {
                prev2 = current2;
                current2 = current2.next;
            }

            // If either node was not found
            if (current1 == null || current2 == null) return;

            // If they are adjacent
            if (prev1 == current2) {
                // Node1 comes before Node2
                prev1.next = current2;
                current1.next = current2.next;
                current2.next = current1;
            } else if (prev2 == current1) {
                // Node2 comes before Node1
                prev2.next = current1;
                current2.next = current1.next;
                current1.next = current2;
            } else {
                // Swap nodes that are not adjacent
                if (prev1 != null) {
                    prev1.next = current2;
                } else {
                    head = current2; // current1 is head
                }
                if (prev2 != null) {
                    prev2.next = current1;
                } else {
                    head = current1; // current2 is head
                }

                Node temp = current2.next; // Save current2.next
                current2.next = current1.next; // Point current2 to next of current1
                current1.next = temp; // Point current1 to next of current2
            }
        }
}