package com.bridgelabz;

public interface Mynode<T> {
	T getdata();
	void setdata(T data);
     
	Mynode<T> getNext();
	void setNext (Mynode<T> next);
}
