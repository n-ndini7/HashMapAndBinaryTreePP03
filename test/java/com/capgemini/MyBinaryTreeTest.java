package com.capgemini;

import org.junit.Test;
import org.junit.Assert;

public class MyBinaryTreeTest {

	@Test
	public void given3Numbers_ShouldAddToTheTree() {
		System.out.println("This test method checks if all the elements are added to the tree.");
		MyBinaryTree<Integer> myTree = new MyBinaryTree<>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		int size = myTree.size();
		Assert.assertEquals(3, size);
	}
}
