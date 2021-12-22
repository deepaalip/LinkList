package com.bridgelabz;



public class MyLinklistMain {
   public static <T> void main(String[] args) {
	   System.out.println("-----------WELCOME TO LINKED LIST-------------");
		
		
	   SortedOrderedlinklist sortedLinkedList = new SortedOrderedlinklist();

		sortedLinkedList.addNode(56);    
		sortedLinkedList.addNode(30);
		sortedLinkedList.addNode(40);
		sortedLinkedList.addNode(70);

		System.out.println("Linked List before sorting :-");
		sortedLinkedList.display();
		
		System.out.println("Linked List after sorting :-");
		sortedLinkedList.sort();
   }
}


