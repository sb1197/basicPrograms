package com.bridgelabz.datastructures;

public class Node<T> {

	T data;
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}
	Node<T> next;
	
	
}
