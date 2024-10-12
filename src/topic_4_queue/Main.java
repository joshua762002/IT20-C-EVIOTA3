/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_4_queue;

/**
 *
 * @author Joshua
 */
public class Main {
    public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("riana"));
	     customerQueue.enqueue(new Customer("dextera"));
	     customerQueue.enqueue(new Customer("jacoba mae"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}

