package com.bridgelabz;

public  class MyLinklist<T> extends Node <T>{
	Node head = null;
	
	MyLinklist(T data, Node Next) {
		super(data, Next);
		// TODO Auto-generated constructor stub
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


