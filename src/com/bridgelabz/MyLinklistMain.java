package com.bridgelabz;



public class MyLinklistMain {
   public static <T> void main(String[] args) {
	   System.out.println("-----------WELCOME TO LINKED LIST-------------");
		
		
		
		 MyLinklist<T>  linklist = new MyLinklist(args, null);
		linklist.add(70);
		linklist.add(30);							
		linklist.add(56);
		
		linklist.printAll(); 
   }
   }


