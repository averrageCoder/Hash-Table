package com.bridgelabz.hashmap;

public class HashMapTest {

	public static void main(String[] args) {
		
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashmap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer value = myLinkedHashmap.get(word);
			if(value==null) value=1;
			else value = value+1;
			myLinkedHashmap.add(word, value);
		}
		System.out.println(myLinkedHashmap);
		myLinkedHashmap.remove("avoidable");
		System.out.println("\n\nAfter removing avoidable: "+myLinkedHashmap);
	}

}
