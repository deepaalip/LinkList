package com.bridgelabz;

public class Node <T> implements Mynode<T>{
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
    public Mynode<T> getNext(){
    	return next;
    }
    
    public void setNext(Mynode next) {
    	this.next = (Node<T>) next;
    }
}
      