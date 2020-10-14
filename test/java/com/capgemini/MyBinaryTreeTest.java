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

	@Test
	public void given6Numbers_ShouldSearch63InTheTreeAndReturnTheSame() {
		System.out.println("\nThis test method checks if the searched element is present in the tree.");
		MyBinaryTree<Integer> myTree = new MyBinaryTree<>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		myTree.add(63);
		myTree.add(24);
		myTree.add(90);
		boolean result = myTree.searchRecursively(63);
		Assert.assertEquals(true, result);
	}
}
