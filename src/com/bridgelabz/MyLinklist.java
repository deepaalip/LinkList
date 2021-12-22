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
	
	public <T> Node popfirst() {
		Node tempNode = head;
		    head = head.getNext();
		        return tempNode;
}
	public <T> void poplast() {
		Node tempNode = head;
    	Node previousToLast = null;  
    	
    	   while(tempNode.next != null) {
    		   previousToLast = tempNode;
    		       tempNode=tempNode.next;
         }
    	
    	             previousToLast.next=null;
} 
	
	public <T>  void search_element( T data) {
		Node tempNode = head;
		   while(tempNode.next != null) {
			  if( (tempNode.data=data) != null) {
				  
				  System.out.println("element found");
				     System.out.println(tempNode.data);
				   break;
			}
			
			tempNode = tempNode.next;
		}
	}
	
	public <T> void insertelement( T previous_data,T insertdata ) {
	     Node tempNode = head;
	        while(tempNode.next != null) { 
	          if(tempNode.data == previous_data) {
		            insert(previous_data,insertdata);
	          }	  
		                tempNode = tempNode.next;          
        } 
	
}	   
	
	 public <T> void deletebydata(T data) {
		 Node tempNode = head;
		  Node previousNode = head;
		  while(tempNode.next != null) { 
	          if(tempNode.data == data) {
	               previousNode.next=tempNode.next;
	               size();
	          }
	           previousNode = tempNode;
	           tempNode = tempNode.next;  
		   }   
	 }
	  public <T> void size() {
		  Node tempNode = head;
			int count = 0;
			while(tempNode != null) {             
				count++;
				tempNode = tempNode.next;
			}
			System.out.println("Size of the Linked List :- " + count);
		
		
	  }
      
	public void printAll() {
	    	Node currentNode = head;
	    	   System.out.println("linklist:" );
	    	
	    	     while(currentNode.next != null) {
	    		    System.out.println(currentNode.data+"->");
	    		        currentNode=currentNode.next;
	    	          }
	                     	System.out.println(currentNode.data);
	    	}
	    	
}


