package com.bridgelabz;

public class Node <T> {
      public T data;
     public  Node next;
	
    Node(T data,Node Next){
    	
    	this.data = data;
    	this.next = null;
    }
    public T getdata() {
    	return data;
    }
    public void setdata(T data){
      this.data = data;
    }
    public Node<T> getNext(){
    	return next;
    }
    
    public void setNext(Node next) {
    	this.next = (Node<T>) next;
    }
}
      