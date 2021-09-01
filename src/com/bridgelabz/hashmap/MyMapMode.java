package com.bridgelabz.hashmap;

public class MyMapMode<K,V> implements INode<K> {

	private K key;
	private V value;
	private MyMapMode<K, V> next;
	
	public MyMapMode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next=null;
	}
	
	public void setNext(INode<K> next){
		this.next=(MyMapMode<K, V>) next;
	}

	public INode<K> getNext(){
		return this.next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K Key) {
		this.key = key;
	}
	
	public String toString() {
		StringBuffer myNodes = new StringBuffer();
		myNodes.append(" MyMapNode{"+"K=").append(key)
		.append(", V=").append(value).append('}');
		
		if(next!=null)
			myNodes.append(" -> ").append(next);
		return myNodes.toString();
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return this.value;
	}
}
