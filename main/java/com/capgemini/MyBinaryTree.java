package com.capgemini;

import com.capgemini.MyBinaryNode;

//UC3 - performs search in a binary tree
public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;
	private MyBinaryNode<K> searchedNode;
	private MyBinaryNode<K> temp;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
		temp = root;
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}

	// creates and adds to the binary search tree

	public int size() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	// returns size of the BST after adding the elements.

	public boolean searchRecursively(K key) {

		if (temp == null)
			return false;
		int result = temp.key.compareTo(key);
		if (result == 0) {
			return true;
		} else if (result < 0) {
			temp = root.right;
			return searchRecursively(key);
		} else {
			temp = temp.left;
			return searchRecursively(key);
		}
	}
	// this method performs search in the BST
}
