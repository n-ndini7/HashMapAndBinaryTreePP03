package com.capgemini;

import com.capgemini.INode;
import java.util.Comparator;

public class LinkedList<K> {

	public INode head;
	public INode tail;
	public int count = 0;
	public int size = 0;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode Node) {
		count++;
		if (this.tail == null) {
			this.tail = Node;
		}
		if (this.head == null) {
			this.head = Node;
		} else {
			INode temp = this.head;
			this.head = Node;
			this.head.setNext(temp);
		}
	}

	// adds to the linkedlist

	public void print() {
		StringBuffer myNodes = new StringBuffer("Linked List: \n");
		INode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!(temp.equals(tail)))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}
	// prints the linkedlist

	public void append(INode node) {
		count++;
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}

	}
	// append to the list

	public void insert(INode myNode, INode Node) {
		INode temp = myNode.getNext();
		myNode.setNext(Node);
		Node.setNext(temp);
	}

	// insert element in the middle of the list

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	// pop the first element of the list

	public INode popLast() {
		INode temp = head;
		while (!temp.getNext().equals(tail)) {
			temp = temp.getNext();
		}
		this.tail = temp;
		temp = temp.getNext();
		return temp;
	}

	// pop the last element of the list

	public INode<K> search(K key) {
		INode<K> temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				System.out.println("Element found!!");
				return temp;
			} else
				temp = temp.getNext();
		}
		return null;
	}

	// search to find a node

	public INode searchAndInsert(K key, INode Node) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getKey().equals(key)) {
				break;
			} else
				temp = temp.getNext();
		}
		INode temp2 = temp.getNext();
		temp.setNext(Node);
		Node.setNext(temp2);
		return temp;
	}
	// search and insert element in the list

	public INode searchAndRemove(K key) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getNext().getKey().equals(key)) {
				break;
			} else
				temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		size--;
		return temp;
	}

	public int Resize() {
		return size;
	}

	// search and remove element from the list and resize it

}