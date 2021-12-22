package com.bridgelabz;

public class MyLinklistMain {
   public static <T> void main(String[] args) {
	   System.out.println("-----------WELCOME TO LINKED LIST-------------");
		
		
		MyLinklist<T> linklist = new MyLinklist(args, null);  
		
		linklist.head = new Node(56,null);                 
		Node  node2 = new Node(30,null);          
		
		Node  node3 = new Node(70,null);                 
													  
		linklist.head.next = node2;             
		node2.next = node3;									
			
		linklist.printAll(); 
     
     
   }

}
