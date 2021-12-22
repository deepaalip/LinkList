package com.bridgelabz;

public  class MyLinklist<T> extends Node <T>{
	 
	    Node head = null;
		MyLinklist(T data, Node Next) {
		super(data, Next);
		// TODO Auto-generated constructor stub
	}

   public <T>void add(T data) {
		Node node = new Node(data,null);          
		node.setdata(data);                       
		node.setNext(head);           
		head = node;  
	
}
	public <T> void append(T data) {
		Node tempNode = head; 
		
		while(tempNode.next != null) {       
			tempNode = tempNode.next;
		}
		Node node = new Node(data,null);              
																		
		tempNode.next = node;	
}
	public <T> void insert( T previous_data,T data ) {
	Node tempNode = head;
	while(tempNode.data != previous_data) {
		tempNode = tempNode.next;          
	}                                           
	Node node = new Node(data,null);
	node.next = tempNode.next;
	tempNode.next = node;
}
      
      public void printAll() {
	    	Node currentNode = head;
	    	System.out.println("linklist:" );
	    	
	    	while(currentNode.getNext() != null) {
	    		System.out.println(currentNode.data+"->");
	    		currentNode=currentNode.next;
	    	}
	    	System.out.println(currentNode.data);
	    		}
	    	
}


