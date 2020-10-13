package com.capgemini;

import org.junit.Test;

import com.capgemini.LinkedList;
import com.capgemini.Node;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

	@Test
	public void testforAdd() {
		System.out.println("This test is for adding node to the list.");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.add(secondNode);
		linkedlist.add(thirdNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(thirdNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(firstNode);
		assertEquals(true, result);
	}

	@Test
	public void testforAppend() {
		System.out.println("This is test method for appending element to the list end.");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(secondNode);
		linkedlist.append(thirdNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(thirdNode);
		assertTrue(result);
	}

	@Test
	public void testforAddInTheMiddleOfTheList() {
		System.out.println("This is test method for inserting element at the middle of the list.");
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.append(thirdNode);
		linkedlist.insert(firstNode, secondNode);
		linkedlist.print();
		boolean result = linkedlist.head.equals(firstNode) && linkedlist.head.getNext().equals(secondNode)
				&& linkedlist.tail.equals(thirdNode);
		assertEquals(true, result);
	}

	@Test
	public void testforPop() {
		System.out.println("This is test method for removing first element of the list.");
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(firstNode);
		linkedlist.add(secondNode);
		linkedlist.add(thirdNode);
		linkedlist.print();
		linkedlist.pop();
		linkedlist.print();
		Node<Integer> pop = (Node<Integer>) linkedlist.pop();
		assertEquals(secondNode, pop);
	}

	@Test
	public void testForPopLast() {
		System.out.println("This is test method for removing last element of the list.");
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(firstNode);
		LinkedList.add(secondNode);
		LinkedList.add(thirdNode);
		LinkedList.print();
		LinkedList.popLast();
		// Node<Integer> popLast = (Node<Integer>) LinkedList.popLast();
		LinkedList.print();
		// assertEquals(thirdNode, popLast);

	}

	@Test
	public void testForSearch() {
		System.out.println("This is test method for searching an element of the list.");
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(firstNode);
		LinkedList.append(secondNode);
		LinkedList.append(thirdNode);
		Node<Integer> search = (Node<Integer>) LinkedList.search(30);
		assertEquals(secondNode, search);
	}

	@Test
	public void testForSearchAndInsert() {
		System.out.println("This is test method for searching and inserting an element in the list.");
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(firstNode);
		LinkedList.append(secondNode);
		LinkedList.append(thirdNode);
		LinkedList.print();
		Node<Integer> fourthNode = new Node<Integer>(80);
		Node<Integer> searchAndInsert = (Node<Integer>) LinkedList.searchAndInsert(30, fourthNode);
		LinkedList.print();
		assertEquals(secondNode, searchAndInsert);
	}

	@Test
	public void testForSearchAndRemove() {
		System.out.println("This is test method for searching and removing an element from the list.");
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(80);
		Node<Integer> fourthNode = new Node<Integer>(70);
		LinkedList LinkedList = new LinkedList();
		LinkedList.add(firstNode);
		LinkedList.append(secondNode);
		LinkedList.append(thirdNode);
		LinkedList.append(fourthNode);
		LinkedList.print();
		Node<Integer> searchAndRemove = (Node<Integer>) LinkedList.searchAndRemove(80);
		System.out.print("Search and Remove! \nSize = " + LinkedList.Resize() + "\n");
		LinkedList.print();
		assertEquals(secondNode, searchAndRemove);
	}
}