package com.bridgelabz.hashmap;

public interface INode<K> {

	K getKey();
	void setKey(K Key);
	
	INode<K> getNext();
	void setNext(INode<K> next);
	
}
