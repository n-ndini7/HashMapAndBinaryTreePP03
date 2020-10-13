package com.capgemini;

import com.capgemini.INode;
import com.capgemini.LinkedList;
import com.capgemini.MyMapNode;

//UC1 - find frequency of words in a sentence 
public class MyHashMap<K, V> {

	LinkedList<K> myList;

	public MyHashMap() {
		this.myList = new LinkedList<>();
	}

	public V get(K key) {

		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			this.myList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{ " + myList + " }";
	}
}