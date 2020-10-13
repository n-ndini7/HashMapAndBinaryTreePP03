package com.capgemini;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedTOTheList_ShouldReturn_Paranoid_Frequency() {
		System.out.println("This is the test to find the frequency of a word in a paragraph.");
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myMap.add(word, value);
		}

		int frequency = myMap.get("paranoid");
		System.out.println(myMap);
		Assert.assertEquals(3, frequency);
	}

	@Test(expected = Exception.class)
	public void givenAWord_ShouldRemoveThatFromTheMap() {
		System.out.println("\nThis is the test to find and remove a word from the paragraph.");
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into " + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myMap.add(word, value);
		}

		MyMapNode<String, Integer> myNode = (MyMapNode<String, Integer>) myMap.removeElement("avoidable");
		System.out.println(myMap);
		Assert.assertEquals(myNode.getNext().getKey(),null);
	}
}
