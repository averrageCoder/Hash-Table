package com.bridgelabz.hashmap;

public class MyHashMap<K, V> {
	
	private MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<>();
	}

	public V get(K key) {
		
		MyMapMode<K,V> myMapNode = (MyMapMode<K,V>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K key, V value) {
		
		MyMapMode<K, V> myMapNode = (MyMapMode<K, V>) this.myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapMode<K, V>(key, value);
			this.myLinkedList.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
	
	public String toString() {
		return "MyLinkedListNodes{"+myLinkedList+"}";
	}
	
}
