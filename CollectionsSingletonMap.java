package com.bean;

import java.util.Collections;
import java.util.Map;

public class CollectionsSingletonMap {
	
	/*
	 * Map<Integer, Integer> map=Collections.singletonMap(K Key, V Value)
	 * The map returned by Collections.singletonMap is immutable
	 * if we try to put or remove from the map 
	 * throws UnsupportedOperationException
	 */
	public static void main(String[] args) {
	Map<Integer,Integer> intVsInt=Collections.singletonMap(1, 1);
	intVsInt.entrySet().forEach(System.out::println);
	intVsInt.put(2, 2);
}
		
	}
