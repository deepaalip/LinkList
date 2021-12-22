package com.bridgelabz;

public class SortedOrderedlinklist <T>{
        Node head = null;
	
	/** add node to the linked list **/
	public void addNode(T data) {
		Node newNode = new Node(data,null);
		newNode.setNext(head);          
		head = newNode;
	}
		
	/** sorting the linked list **/
	public void sort() {
		Node currentNode = head , nextNode = null;
		
		int temp_node;
		if(head == null) {
			return;
		}
		else {
			while(currentNode != null) {
				nextNode = currentNode.next;    //next node point next to current node.
			
				while(nextNode != null) {        
					if(((int)currentNode.data) > ((int)nextNode.data)) {
						temp_node = (int)currentNode.data;      // swaps data if currentNode.data is greater than nextNode.data   
						currentNode.data = nextNode.data;		    //  i.e., currentNode.data becomes nextNode.data and vice-versa
						nextNode.data = temp_node;               // here , temp_node refers currentNode.data
					}
					nextNode = nextNode.next;
				}
				currentNode = currentNode.next;
				
			}
			display();          // calling display method.
		}
	}
	/** display method **/
	public void display() {
		Node currentNode = head;
		if(head == null) {
			System.out.println("List is empty.");
			return;
		}
		while(currentNode != null) {
			System.out.print(currentNode.data + "  ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
