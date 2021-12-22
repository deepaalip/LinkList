package com.bridgelabz;



public class MyLinklistMain {
   public static <T> void main(String[] args) {
	   System.out.println("-----------WELCOME TO LINKED LIST-------------");
		
		
		MyLinklist<T>  linklist = new MyLinklist(args, null);
		
		linklist.add(56); 
		linklist.append(70);
		linklist.insert(56,30);
		
	    linklist.printAll(); 
   }
}


