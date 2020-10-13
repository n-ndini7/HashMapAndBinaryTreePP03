package com.capgemini;

import java.util.ArrayList;

//UC2 - use linkedlist to perform hashtable operation and find frequency of a word in a large paragraph
public class MyLinkedHashMap<K, V> {

	private final int numBuckets;
	ArrayList<LinkedList<K>> myArray;

	public MyLinkedHashMap() {
		this.numBuckets = 10;
		this.myArray = new ArrayList<>(numBuckets);
		// create empty linked list
		for (int i = 0; i < numBuckets; i++) {
			this.myArray.add(null);
		}
	}

	// implements hash function to find index for a key
	public int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		// System.out.println("Key: " + key + " hashCode: " + hashCode + " index: " +
		// index);
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myList = this.myArray.get(index);
		if (myList == null)
			return null;
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> myList = this.myArray.get(index);
		if (myList == null) {
			myList = new LinkedList<>();
			this.myArray.set(index, myList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			myList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyLinkedHashMap List: { " + myArray + " }";
	}
}
